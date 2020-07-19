package com.itchao.tchao_blog.dao;

import com.itchao.tchao_blog.pojo.SysRoleMenu;
import com.itchao.tchao_blog.pojo.SysRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int countByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int deleteByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int insert(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int insertSelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    List<SysRoleMenu> selectByExample(SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    SysRoleMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysRoleMenu record);
}