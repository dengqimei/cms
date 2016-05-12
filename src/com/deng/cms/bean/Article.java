package com.deng.cms.bean;

public class Article {

	private Long id;
	private String title;
	private String author;
	private String content;
	private String course;
	private String date;
	
	public Article(){
		
	}
	
	public Article(String title, String author, String content,String course,String date) {
		super();
		this.title = title;
		this.author = author;
		this.content = content;
		this.course=course;
		this.date=date;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
