package com.itchao.tchao_blog.dao;

import com.itchao.tchao_blog.pojo.LogLike;
import com.itchao.tchao_blog.pojo.LogLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogLikeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_like
     *
     * @mbggenerated
     */
    int countByExample(LogLikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_like
     *
     * @mbggenerated
     */
    int deleteByExample(LogLikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_like
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_like
     *
     * @mbggenerated
     */
    int insert(LogLike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_like
     *
     * @mbggenerated
     */
    int insertSelective(LogLike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_like
     *
     * @mbggenerated
     */
    List<LogLike> selectByExample(LogLikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_like
     *
     * @mbggenerated
     */
    LogLike selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_like
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LogLike record, @Param("example") LogLikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_like
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LogLike record, @Param("example") LogLikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_like
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LogLike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_like
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LogLike record);
}