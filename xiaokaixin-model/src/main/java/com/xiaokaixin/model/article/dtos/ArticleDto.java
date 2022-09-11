package com.xiaokaixin.model.article.dtos;

import com.xiaokaixin.model.article.pojos.ApArticle;
import lombok.Data;

/**
 * @program: xiaokaixin-news
 * @description:
 * @author: xiaokaixin
 * @create: 2022-09-11 14:31
 **/
@Data
public class ArticleDto extends ApArticle {

    /**
     * 文章内容
     */
    private String content;
}
