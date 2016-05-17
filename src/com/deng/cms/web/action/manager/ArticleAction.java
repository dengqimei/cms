package com.deng.cms.web.action.manager;

import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.deng.cms.bean.Article;
import com.deng.cms.bean.Category;
import com.deng.cms.service.IArticleService;
import com.deng.cms.service.ICategoryService;
import com.deng.cms.service.impl.ArticleServiceImpl;
import com.deng.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ArticleAction extends ActionSupport {

	private IArticleService articleService =new ArticleServiceImpl();
	private ICategoryService categoryService=new CategoryServiceImpl();
	
	private Long id;
	private String title;
	private String author;
	private String content;
	private Long c_id;
	
	private List<Article> articleList;
	private Article article;
	private List<Category> categoryList;
	
	private static final long serialVersionUID = 1L;
	
	@Action(value="toAddArticle",results={@Result(name="success"
			,location="/WEB-INF/jsp/manager/addArticle.jsp")})
	public String toAddArticle(){
		categoryList=categoryService.list();
		return SUCCESS;
	}

	@Action(value="addArticle")
	public void addArticle(){
		Article article=new Article();
		article.setTitle(title);
		article.setAuthor(author);
		article.setC_id(c_id);
		article.setContent(content);
		article.setPublishDate(new Date());
		article.setClickTimes(0);
		articleService.add(article);
	}
	@Action(value="toArticleManager",results={@Result(name="success"
			,location="/WEB-INF/jsp/manager/articleManager.jsp")})
	public String toArticleManager(){
		articleList=articleService.list();
		return SUCCESS;
	}
	@Action(value="toUpdArticle",results={@Result(name="success",location="/WEB-INF/jsp/manager/updarticle.jsp")})
	public String toUpdArticle(){
		article=articleService.findById(id);
		categoryList=categoryService.list();
		return SUCCESS;
	}
	@Action(value="updArticle")
	public void updArticle(){
		Article article=new Article();
		article.setId(id);
		article.setTitle(title);
		article.setAuthor(author);
		article.setC_id(c_id);
		article.setContent(content);
		article.setPublishDate(new Date());
		articleService.update(article);
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
	
	public Long getC_id() {
		return c_id;
	}

	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}

	public List<Article> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
	
}
