package com.qst.risk.service.impl;

import com.qst.risk.entity.Risk;
import com.qst.risk.mapper.RiskMapper;
import com.qst.risk.service.IRiskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RiskServiceImpl implements IRiskService {

    @Resource
    private RiskMapper riskMapper;

    @Override
    public Risk findRiskByRiskId(int riskId) {
        return riskMapper.findById(riskId);
    }

    @Override
    public void updateCreditLine(Risk risk) {
        riskMapper.updateRisk(risk);
    }
}
