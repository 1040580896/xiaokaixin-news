package com.xiaokaixin.apis.article;

import com.xiaokaixin.apis.article.fallback.IArticleClientFallback;
import com.xiaokaixin.model.article.dtos.ArticleDto;
import com.xiaokaixin.model.common.dtos.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(value = "leadnews-article",fallback = IArticleClientFallback.class)
public interface IArticleClient {

    @PostMapping("/api/v1/article/save")
    public ResponseResult saveArticle(@RequestBody ArticleDto dto) ;
}