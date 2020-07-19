package com.itchao.tchao_blog.dao;

import com.itchao.tchao_blog.pojo.BookNote;
import com.itchao.tchao_blog.pojo.BookNoteExample;
import com.itchao.tchao_blog.pojo.BookNoteWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookNoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    int countByExample(BookNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    int deleteByExample(BookNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    int insert(BookNoteWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    int insertSelective(BookNoteWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    List<BookNoteWithBLOBs> selectByExampleWithBLOBs(BookNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    List<BookNote> selectByExample(BookNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    BookNoteWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BookNoteWithBLOBs record, @Param("example") BookNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") BookNoteWithBLOBs record, @Param("example") BookNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BookNote record, @Param("example") BookNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BookNoteWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(BookNoteWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BookNote record);
}