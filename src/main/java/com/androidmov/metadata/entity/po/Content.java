package com.androidmov.metadata.entity.po;

import java.io.Serializable;

/**
 * @description: Contents表对应的实体类
 * @author: 卡卢比
 * @date: 2018-05-12 16:43
 **/
public class Content implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private Integer created_at;
    private String year;
    private String doubanid;
    private String img_url;
    private String title;
    private String producer_country;
    private String douban_rating;
    private String language;
    private String douban_rating_sum;
    private String release_date;

    public String getId() {
        return id;
    }

    public Content setId(String id) {
        this.id = id;
        return this;
    }

    public Integer getCreated_at() {
        return created_at;
    }

    public Content setCreated_at(Integer created_at) {
        this.created_at = created_at;
        return this;
    }

    public String getYear() {
        return year;
    }

    public Content setYear(String year) {
        this.year = year;
        return this;
    }

    public String getDoubanid() {
        return doubanid;
    }

    public Content setDoubanid(String doubanid) {
        this.doubanid = doubanid;
        return this;
    }

    public String getImg_url() {
        return img_url;
    }

    public Content setImg_url(String img_url) {
        this.img_url = img_url;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Content setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getProducer_country() {
        return producer_country;
    }

    public Content setProducer_country(String producer_country) {
        this.producer_country = producer_country;
        return this;
    }

    public String getDouban_rating() {
        return douban_rating;
    }

    public Content setDouban_rating(String douban_rating) {
        this.douban_rating = douban_rating;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Content setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getDouban_rating_sum() {
        return douban_rating_sum;
    }

    public Content setDouban_rating_sum(String douban_rating_sum) {
        this.douban_rating_sum = douban_rating_sum;
        return this;
    }

    public String getRelease_date() {
        return release_date;
    }

    public Content setRelease_date(String release_date) {
        this.release_date = release_date;
        return this;
    }
}
