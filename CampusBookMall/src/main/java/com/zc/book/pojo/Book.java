package com.zc.book.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.book.pojo.request.BaseRequest;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Book   extends BaseRequest {
    private String id;
    private String bookId;
    private String bookname;

    private String bookImg;

    private Integer cateId;

    private String bookcategory;

    private String author;

    private String publishinghouse;

    private String printtimes;

    private String createdate;

    private String briefintroduction;

    private BigDecimal price;

    private Integer stock;

    private String bstate;

//    注解@JsonFormat主要是后台到前台的时间格式的转
//    注解@DataFormAT主要是前后到后台的时间格式的转换
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date publishdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getBookcategory() {
        return bookcategory;
    }

    public void setBookcategory(String bookcategory) {
        this.bookcategory = bookcategory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPublishinghouse() {
        return publishinghouse;
    }

    public void setPublishinghouse(String publishinghouse) {
        this.publishinghouse = publishinghouse == null ? null : publishinghouse.trim();
    }

    public String getPrinttimes() {
        return printtimes;
    }

    public void setPrinttimes(String printtimes) {
        this.printtimes = printtimes == null ? null : printtimes.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getBriefintroduction() {
        return briefintroduction;
    }

    public void setBriefintroduction(String briefintroduction) {
        this.briefintroduction = briefintroduction == null ? null : briefintroduction.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getBstate() {
        return bstate;
    }

    public void setBstate(String bstate) {
        this.bstate = bstate;
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }
}