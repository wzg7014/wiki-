package com.wzg.wiki.controller;

import com.wzg.wiki.domain.Demo;
import com.wzg.wiki.service.DemoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService service;

    @GetMapping("/list")
    public List<Demo> list(){
        return service.list();
    }
}
