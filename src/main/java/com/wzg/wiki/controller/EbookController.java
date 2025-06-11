package com.wzg.wiki.controller;

import com.wzg.wiki.Resp.CommonResp;
import com.wzg.wiki.Resp.EbookResp;
import com.wzg.wiki.req.EbookReq;
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
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = service.list(req);
        resp.setContent(list);
        return resp;
    }
}
