package com.qst.risk.controller;

import com.qst.risk.entity.Risk;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@Api(tags = "计算风控额度数据")
@RestController
@RequestMapping("/risk")
public class RiskController {


    @ApiOperation(value = "通过风控主键查询风控数据",notes = "通过风控主键计算风控额度数据")
    @ApiImplicitParam(paramType = "query",dataType = "String",name = "riskId",value = "riskId",example = "1",required = true)
    @GetMapping("/{riskId}")
    public Risk findRiskByRiskId(@PathVariable String riskId){

        return null;
    }
}
