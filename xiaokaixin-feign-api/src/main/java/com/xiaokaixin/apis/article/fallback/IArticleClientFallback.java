package com.xiaokaixin.apis.article.fallback;

import com.xiaokaixin.apis.article.IArticleClient;
import com.xiaokaixin.model.article.dtos.ArticleDto;
import com.xiaokaixin.model.common.dtos.ResponseResult;
import com.xiaokaixin.model.common.enums.AppHttpCodeEnum;
import org.springframework.stereotype.Component;

/**
 * feign失败配置
 * @author itheima
 */
@Component
public class IArticleClientFallback implements IArticleClient {
    @Override
    public ResponseResult saveArticle(ArticleDto dto)  {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"获取数据失败");
    }
}