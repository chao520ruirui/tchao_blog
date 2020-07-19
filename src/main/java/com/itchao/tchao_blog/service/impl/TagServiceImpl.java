package com.itchao.tchao_blog.service.impl;

import com.itchao.tchao_blog.dao.TagMapper;
import com.itchao.tchao_blog.pojo.Tag;
import com.itchao.tchao_blog.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangchao
 * @create 2020-06-15-13:24
 */
@Service
public class TagServiceImpl implements TagService {
    @Resource
    TagMapper tagMapper;
    @Override
    public List<Tag> findAllByType(Integer type) {

        return tagMapper.findAllByType(type);
    }

    @Override
    public List<Tag> getTagListByIds(String tagId) {

        return findAllByIds(tagId.split(","));
    }

    @Override
    public List<Tag> findAllByIds(String[] ids) {
        List<Tag> tags = new ArrayList<>();
        for (String id : ids) {
            Tag tag = findOneById(Integer.parseInt(id));
            tags.add(tag);
        }
        return tags;
    }

    @Override
    public Tag findOneById(Integer id) {

        return tagMapper.findOneById(id);
    }
}
