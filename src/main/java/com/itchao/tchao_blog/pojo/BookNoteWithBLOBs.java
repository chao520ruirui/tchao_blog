package com.itchao.tchao_blog.pojo;

import java.io.Serializable;

public class BookNoteWithBLOBs extends BookNote implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_note.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_note.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_note.content_format
     *
     * @mbggenerated
     */
    private String contentFormat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_note.cover
     *
     * @mbggenerated
     */
    private String cover;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table book_note
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_note.description
     *
     * @return the value of book_note.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_note.description
     *
     * @param description the value for book_note.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_note.content
     *
     * @return the value of book_note.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_note.content
     *
     * @param content the value for book_note.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_note.content_format
     *
     * @return the value of book_note.content_format
     *
     * @mbggenerated
     */
    public String getContentFormat() {
        return contentFormat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_note.content_format
     *
     * @param contentFormat the value for book_note.content_format
     *
     * @mbggenerated
     */
    public void setContentFormat(String contentFormat) {
        this.contentFormat = contentFormat == null ? null : contentFormat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_note.cover
     *
     * @return the value of book_note.cover
     *
     * @mbggenerated
     */
    public String getCover() {
        return cover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_note.cover
     *
     * @param cover the value for book_note.cover
     *
     * @mbggenerated
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_note
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