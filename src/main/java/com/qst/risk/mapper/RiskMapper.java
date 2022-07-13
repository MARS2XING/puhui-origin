package com.qst.risk.mapper;

import com.qst.risk.entity.Risk;

public interface RiskMapper{

    public Risk findById(int riskId);

    public void updateRisk(Risk risk);
}
