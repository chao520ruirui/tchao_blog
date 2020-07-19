package com.itchao.tchao_blog.service.impl;

import com.itchao.tchao_blog.dao.CategoryMapper;
import com.itchao.tchao_blog.pojo.Category;
import com.itchao.tchao_blog.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangchao
 * @create 2020-06-14-22:23
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    CategoryMapper categoryMapper;

    @Override
    public List<Category> findAllByType(Integer type) {
        List<Category> categories = categoryMapper.findAllByType(type);
        categories = handleCategory(categories);
        return categories;
    }

    @Override
    public String getCategoryNames(String categoryId) {
        String [] ids = categoryId.split(",");
        List<Category> categories = findCategoryByIds(ids);
        StringBuffer categoryBufferName = new StringBuffer();
        for (Category category : categories) {
            categoryBufferName.append(category.getName()).append(",");
        }
        String categoryName = categoryBufferName.toString().substring(0, categoryBufferName.toString().length()-1);
        return categoryName;
    }

    @Override
    public List<Category> findCategoryByIds(String[] ids) {
        List<Category> categories = new ArrayList<>();
        for (String id : ids) {
            Category category = findOneById(Integer.parseInt(id));
            categories.add(category);
        }
        return categories;
    }

    @Override
    public Category findOneById(Integer id) {
        return categoryMapper.findOneById(id);
    }

    private List<Category> handleCategory(List<Category> categories) {

        List<Category> root = new ArrayList<>();
        for (Category category : categories) {
            if (category.getParentId() == -1) {
                root.add(category);
            }
        }
        for (Category category : root) {
            List<Category> childrens = getChildren(category.getId(), categories);
            category.setChildren(childrens);
        }
        return root;

    }

    private List<Category> getChildren(Integer id, List<Category> categories) {
        List<Category> childrens = new ArrayList<>();
        for (Category category : categories) {
            if (category.getParentId() == id) {
                childrens.add(category);
            }
        }

        for (Category children : childrens) {
            children.setChildren(getChildren(children.getId(), categories));
        }

        if (childrens.size() == 0) {
            return null;
        }
        return childrens;
    }
}
