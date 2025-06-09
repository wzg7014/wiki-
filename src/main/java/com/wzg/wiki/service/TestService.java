package com.wzg.wiki.service;

import com.wzg.wiki.domain.Test;
import com.wzg.wiki.mapper.TestMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper mapper;


    public List<Test> list(){
        return mapper.list();
    }
}
