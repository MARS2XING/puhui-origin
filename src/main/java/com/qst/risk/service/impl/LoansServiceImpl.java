package com.qst.risk.service.impl;

import com.qst.risk.entity.Loans;
import com.qst.risk.mapper.LoansMapper;
import com.qst.risk.service.ILoansService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoansServiceImpl implements ILoansService {

    @Resource
    private LoansMapper loansMapper;

    @Override
    public int selectLoansByLoaNo(String loaNo) {
        System.out.println(loaNo);
        String loaId = loansMapper.selectLoansByLoaNo(loaNo);
        if(loaId != null){
            return Integer.parseInt(loaId);
        }else{
            return 0;
        }
    }

    @Override
    public void updateLoaMoney(Loans loans) {
        loansMapper.updateLoaMoney(loans);
    }
}
