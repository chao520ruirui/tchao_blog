package com.itchao.tchao_blog.pojo;

import java.io.Serializable;

public class Recommend implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.link_id
     *
     * @mbggenerated
     */
    private Integer linkId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.order_num
     *
     * @mbggenerated
     */
    private Integer orderNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.top
     *
     * @mbggenerated
     */
    private Boolean top;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table recommend
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.id
     *
     * @return the value of recommend.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.id
     *
     * @param id the value for recommend.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.link_id
     *
     * @return the value of recommend.link_id
     *
     * @mbggenerated
     */
    public Integer getLinkId() {
        return linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.link_id
     *
     * @param linkId the value for recommend.link_id
     *
     * @mbggenerated
     */
    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.type
     *
     * @return the value of recommend.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.type
     *
     * @param type the value for recommend.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.order_num
     *
     * @return the value of recommend.order_num
     *
     * @mbggenerated
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.order_num
     *
     * @param orderNum the value for recommend.order_num
     *
     * @mbggenerated
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.title
     *
     * @return the value of recommend.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.title
     *
     * @param title the value for recommend.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.top
     *
     * @return the value of recommend.top
     *
     * @mbggenerated
     */
    public Boolean getTop() {
        return top;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.top
     *
     * @param top the value for recommend.top
     *
     * @mbggenerated
     */
    public void setTop(Boolean top) {
        this.top = top;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommend
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", linkId=").append(linkId);
        sb.append(", type=").append(type);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", title=").append(title);
        sb.append(", top=").append(top);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}