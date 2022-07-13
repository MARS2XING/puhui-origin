package com.qst.risk.service;

import com.qst.risk.entity.Risk;

public interface IRiskService {

    /*查找风控记录*/
    public Risk findRiskByRiskId(int riskId);

    /*将额度值更新到风控表*/
    public void updateCreditLine(Risk risk);

}
