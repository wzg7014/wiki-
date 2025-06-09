package com.wzg.wiki.service;

import com.wzg.wiki.domain.Demo;
import com.wzg.wiki.mapper.DemoMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Resource
    private DemoMapper mapper;


    public List<Demo> list(){
        return mapper.selectByExample(null);
    }
}
