package com.itchao.tchao_blog.service;

import com.itchao.tchao_blog.pojo.Category;

import java.util.List;

/**
 * @author wangchao
 * @create 2020-06-14-22:16
 */
public interface CategoryService {

    List<Category> findAllByType(Integer type);

    String getCategoryNames(String categoryId);

    List<Category> findCategoryByIds(String [] ids);

    Category findOneById(Integer id);
}
