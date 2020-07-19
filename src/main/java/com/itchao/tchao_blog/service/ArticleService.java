package com.itchao.tchao_blog.service;

import com.itchao.tchao_blog.pojo.ArticleWithBLOBs;

import java.util.Map;

/**
 * @author wangchao
 * @create 2020-06-16-14:25
 */
public interface ArticleService {

    void insertArticle(ArticleWithBLOBs articleWithBLOBs) throws Exception;

    Map<String, Object> listArticleByTitle(int start, int size, String title);

    void updateStatus(ArticleWithBLOBs articleWithBLOBs);

    ArticleWithBLOBs findOneById(int id);

    void updateArticleById(ArticleWithBLOBs articleWithBLOBs);
}
