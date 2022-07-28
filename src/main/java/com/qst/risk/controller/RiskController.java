package com.qst.risk.controller;

import com.qst.risk.entity.Aptitude;
import com.qst.risk.entity.Loans;
import com.qst.risk.entity.Risk;
import com.qst.risk.service.IAptitudeService;
import com.qst.risk.service.ILoansService;
import com.qst.risk.service.IRiskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.text.DecimalFormat;

@Api(tags = "计算风控额度数据")
@RestController
@RequestMapping("/risk")
public class RiskController {

    @Resource
    private IRiskService riskService;

    @Resource
    private ILoansService loansService;

    @Resource
    private IAptitudeService aptitudeService;

    @ApiOperation(value = "通过风控主键查询风控数据",notes = "通过风控主键计算风控额度数据")
    @ApiImplicitParam(paramType = "query",dataType = "String",name = "riskId",value = "riskId",example = "1",required = true)
    @GetMapping("/{riskId}")
    public Risk findRiskByRiskId(@PathVariable String riskId){
        int rId = Integer.parseInt(riskId);
        Risk risk = riskService.findRiskByRiskId(rId);

        /*抵押物价值*70%*/
        double ap = Double.parseDouble(risk.getApt_price())*0.7;
        System.out.println("抵押物："+ap);
        /*总负债*/
        double gl = Double.parseDouble(risk.getGross_liabilities());
        System.out.println("总负债:"+gl);
        /*月流水最小值*贷款周期*/
        int mam = risk.getMonth_account_min();
        Long lli = risk.getLoa_lis_id();
        double mall = mam*lli;
        System.out.println("月流水*周期："+mall);
        /*最大计算额度值=抵押物价值*70%-总负债+月流水最小值*贷款周期*/
        double calRlt = ap-gl+mall;
        System.out.println("最大额度是："+calRlt);

        /*申请额度*/
        Long lm = risk.getLoa_money();
        System.out.println("申请额度："+lm);
        Risk r = null;
        /*通过贷款编号找到贷款id*/
        System.out.println(risk.getLoa_no()+"!!!");
        int lid = loansService.selectLoansByLoaNo(risk.getLoa_no());
        System.out.println(lid);
        Aptitude apt = null;
        Loans loan = null;
        /*最大计算额度值>=申请额度,返回申请额度；否则返回最大计算额度值*/
        if(calRlt>=lm){
            /*将额度更新到数据库表中*/
            r = new Risk(rId,lm.toString());
            riskService.updateCreditLine(r);

            /*通过贷款id更新到aptitude资质管理表的信用额度字段中apt_credit*/
            apt = new Aptitude(lid,lm.toString());

            /*通过贷款id更新到loans贷款表的贷款金额字段中loa_money*/
            loan = new Loans(lid,lm);
            System.out.println(loan);
            loansService.updateLoaMoney(loan);

        }else if(calRlt<lm && calRlt>0){
            DecimalFormat format = new DecimalFormat("#.00");
            String cr= format.format(calRlt);
            System.out.println(cr+"+++++++");

            r = new Risk(rId,cr);
            riskService.updateCreditLine(r);

            /*通过贷款id更新到aptitude资质管理表的信用额度字段中apt_credit*/
            apt = new Aptitude(lid,cr);


            /*通过贷款id更新到loans贷款表的贷款金额字段中loa_money*/
            loan = new Loans(lid,(long)calRlt);
            loansService.updateLoaMoney(loan);
        }else if(calRlt<0){
            r = new Risk(rId,"0");
            riskService.updateCreditLine(r);
            apt = new Aptitude(lid,"0");
            loan = new Loans(lid,(long)0);
            loansService.updateLoaMoney(loan);
        }
        aptitudeService.updateAptitude(apt);
        return risk;
    }
}
