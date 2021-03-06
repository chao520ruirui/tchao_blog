package com.itchao.tchao_blog.pojo;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.cover
     *
     * @mbggenerated
     */
    private String cover;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.author
     *
     * @mbggenerated
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.category_id
     *
     * @mbggenerated
     */
    private String categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.recommend
     *
     * @mbggenerated
     */
    private Boolean recommend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.publisher
     *
     * @mbggenerated
     */
    private String publisher;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.publish_date
     *
     * @mbggenerated
     */
    private Date publishDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.page_num
     *
     * @mbggenerated
     */
    private Integer pageNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.grade
     *
     * @mbggenerated
     */
    private Double grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.read_num
     *
     * @mbggenerated
     */
    private Integer readNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.comment_num
     *
     * @mbggenerated
     */
    private Integer commentNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.like_num
     *
     * @mbggenerated
     */
    private Integer likeNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.publish
     *
     * @mbggenerated
     */
    private Boolean publish;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.progress
     *
     * @mbggenerated
     */
    private Integer progress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.reading
     *
     * @mbggenerated
     */
    private Boolean reading;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table book
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.id
     *
     * @return the value of book.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.id
     *
     * @param id the value for book.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.title
     *
     * @return the value of book.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.title
     *
     * @param title the value for book.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.cover
     *
     * @return the value of book.cover
     *
     * @mbggenerated
     */
    public String getCover() {
        return cover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.cover
     *
     * @param cover the value for book.cover
     *
     * @mbggenerated
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.author
     *
     * @return the value of book.author
     *
     * @mbggenerated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.author
     *
     * @param author the value for book.author
     *
     * @mbggenerated
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.category_id
     *
     * @return the value of book.category_id
     *
     * @mbggenerated
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.category_id
     *
     * @param categoryId the value for book.category_id
     *
     * @mbggenerated
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.recommend
     *
     * @return the value of book.recommend
     *
     * @mbggenerated
     */
    public Boolean getRecommend() {
        return recommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.recommend
     *
     * @param recommend the value for book.recommend
     *
     * @mbggenerated
     */
    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.publisher
     *
     * @return the value of book.publisher
     *
     * @mbggenerated
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.publisher
     *
     * @param publisher the value for book.publisher
     *
     * @mbggenerated
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.publish_date
     *
     * @return the value of book.publish_date
     *
     * @mbggenerated
     */
    public Date getPublishDate() {
        return publishDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.publish_date
     *
     * @param publishDate the value for book.publish_date
     *
     * @mbggenerated
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.page_num
     *
     * @return the value of book.page_num
     *
     * @mbggenerated
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.page_num
     *
     * @param pageNum the value for book.page_num
     *
     * @mbggenerated
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.grade
     *
     * @return the value of book.grade
     *
     * @mbggenerated
     */
    public Double getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.grade
     *
     * @param grade the value for book.grade
     *
     * @mbggenerated
     */
    public void setGrade(Double grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.create_time
     *
     * @return the value of book.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.create_time
     *
     * @param createTime the value for book.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.update_time
     *
     * @return the value of book.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.update_time
     *
     * @param updateTime the value for book.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.read_num
     *
     * @return the value of book.read_num
     *
     * @mbggenerated
     */
    public Integer getReadNum() {
        return readNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.read_num
     *
     * @param readNum the value for book.read_num
     *
     * @mbggenerated
     */
    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.comment_num
     *
     * @return the value of book.comment_num
     *
     * @mbggenerated
     */
    public Integer getCommentNum() {
        return commentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.comment_num
     *
     * @param commentNum the value for book.comment_num
     *
     * @mbggenerated
     */
    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.like_num
     *
     * @return the value of book.like_num
     *
     * @mbggenerated
     */
    public Integer getLikeNum() {
        return likeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.like_num
     *
     * @param likeNum the value for book.like_num
     *
     * @mbggenerated
     */
    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.publish
     *
     * @return the value of book.publish
     *
     * @mbggenerated
     */
    public Boolean getPublish() {
        return publish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.publish
     *
     * @param publish the value for book.publish
     *
     * @mbggenerated
     */
    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.progress
     *
     * @return the value of book.progress
     *
     * @mbggenerated
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.progress
     *
     * @param progress the value for book.progress
     *
     * @mbggenerated
     */
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.reading
     *
     * @return the value of book.reading
     *
     * @mbggenerated
     */
    public Boolean getReading() {
        return reading;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.reading
     *
     * @param reading the value for book.reading
     *
     * @mbggenerated
     */
    public void setReading(Boolean reading) {
        this.reading = reading;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
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
        sb.append(", title=").append(title);
        sb.append(", cover=").append(cover);
        sb.append(", author=").append(author);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", recommend=").append(recommend);
        sb.append(", publisher=").append(publisher);
        sb.append(", publishDate=").append(publishDate);
        sb.append(", pageNum=").append(pageNum);
        sb.append(", grade=").append(grade);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", readNum=").append(readNum);
        sb.append(", commentNum=").append(commentNum);
        sb.append(", likeNum=").append(likeNum);
        sb.append(", publish=").append(publish);
        sb.append(", progress=").append(progress);
        sb.append(", reading=").append(reading);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}