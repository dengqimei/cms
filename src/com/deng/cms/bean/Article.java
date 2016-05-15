package com.deng.cms.bean;

import java.util.Date;

public class Article {

	private Long id;
	private String title;
	private String author;
	private String content;
	private Date publishDate;
	private Integer clickTimes;
	private Long c_id;
	private String name;//所属栏目名称
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Integer getClickTimes() {
		return clickTimes;
	}
	public void setClickTimes(Integer clickTimes) {
		this.clickTimes = clickTimes;
	}
	public Long getC_id() {
		return c_id;
	}
	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}
	public Article(Long id, String title, String author, String content,
			Date publishDate, Integer clickTimes, Long c_id) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.content = content;
		this.publishDate = publishDate;
		this.clickTimes = clickTimes;
		this.c_id = c_id;
	}
	public Article() {
		// TODO Auto-generated constructor stub
	}
	
	
}