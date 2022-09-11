package com.xiaokaixin.wemedia.controller.v1;

import com.xiaokaixin.model.common.dtos.ResponseResult;
import com.xiaokaixin.model.wemedia.dtos.WmNewsDto;
import com.xiaokaixin.model.wemedia.dtos.WmNewsPageReqDto;
import com.xiaokaixin.wemedia.service.WmNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class WmNewsController {


    @Autowired
    private WmNewsService wmNewsService;

    // 文章列表
    @PostMapping("/list")
    public ResponseResult findAll(@RequestBody WmNewsPageReqDto dto){
        return  wmNewsService.findAll(dto);
    }

    // 文章提交
    @PostMapping("/submit")
    public ResponseResult submitNews(@RequestBody WmNewsDto dto){
        return  wmNewsService.submitNews(dto);
    }
}