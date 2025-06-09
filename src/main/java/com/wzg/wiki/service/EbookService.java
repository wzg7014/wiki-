package com.wzg.wiki.service;

import com.wzg.wiki.domain.Ebook;
import com.wzg.wiki.mapper.EbookMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper mapper;


    public List<Ebook> list(){
        return mapper.selectByExample(null);
    }
}
