package com.itchao.tchao_blog.controller;

import com.itchao.tchao_blog.config.OssTemplate;
import com.itchao.tchao_blog.pojo.ArticleWithBLOBs;
import com.itchao.tchao_blog.result.Result;
import com.itchao.tchao_blog.result.ResultFactory;
import com.itchao.tchao_blog.service.ArticleService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author wangchao
 * @create 2020-06-15-23:58
 */
@RestController
public class ArticleController {

    @Resource
    ArticleService articleService;
    @Resource
    OssTemplate ossTemplate;

    @PostMapping("/api/admin/article/cover")
    public String coversUpload(MultipartFile file) throws Exception {
        return ossTemplate.upload(file.getInputStream(), file.getOriginalFilename());
    }

    @PostMapping("/api/admin/article/save")
    public Result insertArticle(@RequestBody ArticleWithBLOBs articleWithBLOBs) {
        try{
            articleService.insertArticle(articleWithBLOBs);
            return ResultFactory.buildSuccessResult(null);
        }catch (Exception e) {
            e.printStackTrace();
            return ResultFactory.buildFailResult(e.getMessage());
        }
    }

    @DeleteMapping("/api/admin/article/cover/delete/{fileName}")
    public Result deleteQiNiu(@PathVariable("fileName") String fileName) {
        ossTemplate.deleteFile(fileName);

        return ResultFactory.buildSuccessResult("ok");
    }

    @GetMapping("/api/admin/articles/list")
    public Result listArticleByTitle(@RequestParam(value = "start", defaultValue = "1")int start, @RequestParam(value = "size", defaultValue = "10")int size,
                                     @RequestParam(value = "title")String title) {
        return ResultFactory.buildSuccessResult(articleService.listArticleByTitle(start, size, title));
    }

    @PutMapping("/api/admin/articles/update/status")
    public Result updateStatus(@RequestBody ArticleWithBLOBs articleWithBLOBs) {
        articleService.updateStatus(articleWithBLOBs);
        return ResultFactory.buildSuccessResult(null);
    }

    @GetMapping("/api/admin/article/info/{id}")
    public Result findOneById(@PathVariable("id")int id) {
        return ResultFactory.buildSuccessResult(articleService.findOneById(id));
    }

    @PutMapping("/api/admin/article/update")
    public Result updateArticle(@RequestBody ArticleWithBLOBs articleWithBLOBs) {
        articleService.updateArticleById(articleWithBLOBs);
        return ResultFactory.buildSuccessResult(null);
    }


}
