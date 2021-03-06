package com.itchao.tchao_blog.pojo;

import java.io.Serializable;

public class BookWithBLOBs extends Book implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.catalogue
     *
     * @mbggenerated
     */
    private String catalogue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table book
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.description
     *
     * @return the value of book.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.description
     *
     * @param description the value for book.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.catalogue
     *
     * @return the value of book.catalogue
     *
     * @mbggenerated
     */
    public String getCatalogue() {
        return catalogue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.catalogue
     *
     * @param catalogue the value for book.catalogue
     *
     * @mbggenerated
     */
    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue == null ? null : catalogue.trim();
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
        sb.append(", description=").append(description);
        sb.append(", catalogue=").append(catalogue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}