package com.itchao.tchao_blog.dto;

import com.itchao.tchao_blog.pojo.Category;
import com.itchao.tchao_blog.pojo.Tag;
import lombok.Data;

import java.util.List;

/**
 * @author wangchao
 * @create 2020-06-17-23:44
 */
@Data
public class ArticleVO {

    private Integer id;

    private String title;

    private String author;

    private Integer readNum;

    private Integer commentNum;

    private Boolean recommend;

    private List<Category> categories;

    private String category;

    private Byte publish;

    private Boolean top;

    private List<Tag> tags;

    private String description;

    private String content;

    private String contentFormat;

    private String cover;




}
