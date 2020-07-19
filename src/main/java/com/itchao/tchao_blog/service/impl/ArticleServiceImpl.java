package com.itchao.tchao_blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itchao.tchao_blog.dao.ArticleMapper;
import com.itchao.tchao_blog.dto.ArticleVO;
import com.itchao.tchao_blog.pojo.Article;
import com.itchao.tchao_blog.pojo.ArticleWithBLOBs;
import com.itchao.tchao_blog.service.ArticleService;
import com.itchao.tchao_blog.service.CategoryService;
import com.itchao.tchao_blog.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangchao
 * @create 2020-06-16-14:27
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    ArticleMapper articleMapper;
    @Resource
    CategoryService categoryService;
    @Resource
    TagService tagService;

    @Override
    public void insertArticle(ArticleWithBLOBs articleWithBLOBs) throws Exception {
        articleWithBLOBs.setLikeNum(0);
        articleWithBLOBs.setReadNum(0);
        articleWithBLOBs.setCommentNum(0);
        articleWithBLOBs.setPublish((byte) 1);
        articleWithBLOBs.setTop(true);
        articleMapper.insert(articleWithBLOBs);
    }

    @Override
    public Map<String, Object> listArticleByTitle(int start, int size, String title) {
        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(start, size);
        List<Article> articles = articleMapper.findAllByTitle(title);
        PageInfo<Article> pageInfo = new PageInfo<>(articles);
        List<Article> articleList = pageInfo.getList();
        List<ArticleVO> articleVOS = handleArticle(articleList);
        map.put("articles", articleVOS);
        map.put("total", pageInfo.getTotal());
        return map;
    }

    @Override
    public void updateStatus(ArticleWithBLOBs articleWithBLOBs) {
        articleMapper.updateStatus(articleWithBLOBs);
    }

    @Override
    public ArticleWithBLOBs findOneById(int id) {
        return articleMapper.findOneById(id);
    }

    @Override
    public void updateArticleById(ArticleWithBLOBs articleWithBLOBs) {
        articleMapper.updateArticleById(articleWithBLOBs);
    }

    private List<ArticleVO> handleArticle(List<Article> articleList) {
        List<ArticleVO> articleVOS = new ArrayList<>();
        for (Article article : articleList) {
            ArticleVO articleVO = new ArticleVO();
            articleVO.setId(article.getId());
            articleVO.setTitle(article.getTitle());
            articleVO.setReadNum(article.getReadNum());
            articleVO.setRecommend(article.getRecommend());
            articleVO.setCommentNum(article.getCommentNum());
            if (article.getCategoryId() != null) {
                articleVO.setCategory(categoryService.getCategoryNames(article.getCategoryId()));
            }else {
                articleVO.setCategory(null);
            }
            articleVO.setPublish(article.getPublish());
            articleVO.setTop(article.getTop());
            if (article.getTagId() != null) {
                articleVO.setTags(tagService.getTagListByIds(article.getTagId()));
            }else {
                articleVO.setTags(null);
            }
            articleVOS.add(articleVO);
        }
        return articleVOS;
    }
}
