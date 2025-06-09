package com.wzg.wiki.controller;

import com.wzg.wiki.domain.Ebook;
import com.wzg.wiki.service.EbookService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService service;

    @GetMapping("/list")
    public List<Ebook> list(){
        return service.list();
    }
}
