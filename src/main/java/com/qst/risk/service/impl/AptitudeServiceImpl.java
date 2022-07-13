package com.qst.risk.service.impl;

import com.qst.risk.entity.Aptitude;
import com.qst.risk.mapper.AptitudeMapper;
import com.qst.risk.service.IAptitudeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AptitudeServiceImpl implements IAptitudeService {

    @Resource
    private AptitudeMapper aptitudeMapper;

    @Override
    public void updateAptitude(Aptitude aptitude) {
        aptitudeMapper.updateAptitude(aptitude);
    }
}
