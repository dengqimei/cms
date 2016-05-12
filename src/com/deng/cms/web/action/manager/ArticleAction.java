package com.deng.cms.web.action.manager;

import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.deng.cms.bean.Article;
import com.deng.cms.service.IArticleService;
import com.deng.cms.service.impl.ArticleServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ArticleAction extends ActionSupport {

	private IArticleService articleService =new ArticleServiceImpl();
	private Long id;
	private String title;
	private String author;
	private String content;
	private String course;
	private String date;
	private List<Article> articleList;
	
	private static final long serialVersionUID = 1L;
	
	@Action(value="toAddArticle",results={@Result(name="success"
			,location="/WEB-INF/jsp/manager/addArticle.jsp")})
	public String toAddArticle(){
		return SUCCESS;
	}

	@Action(value="addArticle")
	public void addArticle(){
		Article article=new Article(title,author,content,course,date);
		articleService.add(article);
	}
	@Action(value="toArticleManager",results={@Result(name="success"
			,location="/WEB-INF/jsp/manager/articleManager.jsp")})
	public String toArticleManager(){
		articleList=articleService.list();
		return SUCCESS;
	}
	@Action(value="delArticle")
	public void delArticle(){
		articleService.deleteById(id);
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

	public List<Article> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}
}
