package com.itchao.tchao_blog.service;

import com.itchao.tchao_blog.pojo.Tag;

import java.util.List;

/**
 * @author wangchao
 * @create 2020-06-15-13:23
 */
public interface TagService {

    List<Tag> findAllByType(Integer type);

    List<Tag> getTagListByIds(String tagId);

    List<Tag> findAllByIds(String [] ids);

    Tag findOneById(Integer id);
}
