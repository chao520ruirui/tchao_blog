package com.itchao.tchao_blog.controller;

import com.itchao.tchao_blog.result.Result;
import com.itchao.tchao_blog.result.ResultFactory;
import com.itchao.tchao_blog.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangchao
 * @create 2020-06-14-22:14
 */
@RestController
public class CategoryController {

    @Resource
    CategoryService categoryService;

    @GetMapping("/api/admin/categories/list/{type}")
    public Result listCategoryByType(@PathVariable("type")Integer type) {
        return ResultFactory.buildSuccessResult(categoryService.findAllByType(type));
    }

}
