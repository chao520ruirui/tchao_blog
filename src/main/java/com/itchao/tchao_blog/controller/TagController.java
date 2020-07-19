package com.itchao.tchao_blog.controller;

import com.itchao.tchao_blog.result.Result;
import com.itchao.tchao_blog.result.ResultFactory;
import com.itchao.tchao_blog.service.TagService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangchao
 * @create 2020-06-15-13:22
 */
@RestController
public class TagController {

    @Resource
    TagService tagService;

    @GetMapping("/api/admin/tags/list/{type}")
    public Result listByType(@PathVariable("type")Integer type) {
        return ResultFactory.buildSuccessResult(tagService.findAllByType(type));
    }
}
