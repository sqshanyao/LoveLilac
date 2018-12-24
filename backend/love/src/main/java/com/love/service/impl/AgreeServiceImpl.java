package com.love.service.impl;

import com.love.domain.CommonConfig;
import com.love.mybatis.CommonConfigMapper;
import com.love.service.AgreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgreeServiceImpl implements AgreeService {
    @Autowired
    CommonConfigMapper mapper;


    @Override
    public CommonConfig getByType(Integer type) {
        return mapper.findByType(type);
    }
}
