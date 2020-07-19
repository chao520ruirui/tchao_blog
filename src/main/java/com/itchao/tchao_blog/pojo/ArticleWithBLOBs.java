package com.itchao.tchao_blog.pojo;

import java.io.Serializable;

public class ArticleWithBLOBs extends Article implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content_format
     *
     * @mbggenerated
     */
    private String contentFormat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.cover
     *
     * @mbggenerated
     */
    private String cover;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.description
     *
     * @return the value of article.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.description
     *
     * @param description the value for article.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content
     *
     * @param content the value for article.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content_format
     *
     * @return the value of article.content_format
     *
     * @mbggenerated
     */
    public String getContentFormat() {
        return contentFormat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content_format
     *
     * @param contentFormat the value for article.content_format
     *
     * @mbggenerated
     */
    public void setContentFormat(String contentFormat) {
        this.contentFormat = contentFormat == null ? null : contentFormat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.cover
     *
     * @return the value of article.cover
     *
     * @mbggenerated
     */
    public String getCover() {
        return cover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.cover
     *
     * @param cover the value for article.cover
     *
     * @mbggenerated
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", description=").append(description);
        sb.append(", content=").append(content);
        sb.append(", contentFormat=").append(contentFormat);
        sb.append(", cover=").append(cover);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}