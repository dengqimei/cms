package com.deng.cms.web.action;

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

public class BaseAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private List<Article> articleList;
	private List<Article> articleList1;
	private List<Article> articleList2;
	private List<Article> articleList3;
	private List<Article> articleList4;
	private List<Article> articleList5;
	private List<Article> articleList6;
	private List<Article> articleList7;
	private List<Article> articleList8;
	private List<Article> articleList9;
	private Article article;
	private Category category;
	private Category category1;
	private Category category2;
	private Category category3;
	private Category category4;
	private Category category5;
	private Category category6;
	private Category category7;
	private Category category8;
	private Category category9;
	private List<Category> categoryList;
	private ICategoryService categoryService=new CategoryServiceImpl();
	private IArticleService articleService=new ArticleServiceImpl();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Article> getArticleList() {
		return articleList;
	}
	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}
	public List<Category> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
	/**
	 * 跳转到前台首页面
	 * */
	@Action(value="toIndex",results={@Result(name="success",location="/WEB-INF/jsp/index.jsp")})
	public String toIndex(){
		categoryList=categoryService.list();
		category1=categoryList.get(1);
		category2=categoryList.get(2);
		category3=categoryList.get(3);
		category4=categoryList.get(4);
		category5=categoryList.get(5);
		category6=categoryList.get(6);
		category7=categoryList.get(7);
		category8=categoryList.get(8);
		category9=categoryList.get(9);
		articleList1=articleService.findByCid(categoryList.get(1).getId());
		articleList2=articleService.findByCid(categoryList.get(2).getId());
		articleList3=articleService.findByCid(categoryList.get(3).getId());
		articleList4=articleService.findByCid(categoryList.get(4).getId());
		articleList5=articleService.findByCid(categoryList.get(5).getId());
		articleList6=articleService.findByCid(categoryList.get(6).getId());
		articleList7=articleService.findByCid(categoryList.get(7).getId());
		articleList8=articleService.findByCid(categoryList.get(8).getId());
		articleList9=articleService.findByCid(categoryList.get(9).getId());
		return SUCCESS;
	}
	/**
	 * 跳转到前台首页面
	 * */
	@Action(value="toList",results={@Result(name="success",location="/WEB-INF/jsp/list.jsp")})
	public String toList(){
		categoryList=categoryService.list();
		category=categoryService.findById(id);
		articleList=articleService.findByCid(id);
		return SUCCESS;
	}
	/**
	 * 跳转到前台首页面
	 * */
	@Action(value="toContent",results={@Result(name="success",location="/WEB-INF/jsp/content.jsp")})
	public String toContent(){
		categoryList=categoryService.list();
		article=articleService.findById(id);
		Long c_id=article.getC_id();
		category=categoryService.findById(c_id);
		return SUCCESS;
	}
	
	
	public List<Article> getArticleList1() {
		return articleList1;
	}
	public void setArticleList1(List<Article> articleList1) {
		this.articleList1 = articleList1;
	}
	public List<Article> getArticleList2() {
		return articleList2;
	}
	public void setArticleList2(List<Article> articleList2) {
		this.articleList2 = articleList2;
	}
	public List<Article> getArticleList3() {
		return articleList3;
	}
	public void setArticleList3(List<Article> articleList3) {
		this.articleList3 = articleList3;
	}
	public List<Article> getArticleList4() {
		return articleList4;
	}
	public void setArticleList4(List<Article> articleList4) {
		this.articleList4 = articleList4;
	}
	public List<Article> getArticleList5() {
		return articleList5;
	}
	public void setArticleList5(List<Article> articleList5) {
		this.articleList5 = articleList5;
	}
	public List<Article> getArticleList6() {
		return articleList6;
	}
	public void setArticleList6(List<Article> articleList6) {
		this.articleList6 = articleList6;
	}
	public List<Article> getArticleList7() {
		return articleList7;
	}
	public void setArticleList7(List<Article> articleList7) {
		this.articleList7 = articleList7;
	}
	public List<Article> getArticleList8() {
		return articleList8;
	}
	public void setArticleList8(List<Article> articleList8) {
		this.articleList8 = articleList8;
	}
	public List<Article> getArticleList9() {
		return articleList9;
	}
	public void setArticleList9(List<Article> articleList9) {
		this.articleList9 = articleList9;
	}
	public Category getCategory1() {
		return category1;
	}
	public void setCategory1(Category category1) {
		this.category1 = category1;
	}
	public Category getCategory2() {
		return category2;
	}
	public void setCategory2(Category category2) {
		this.category2 = category2;
	}
	public Category getCategory3() {
		return category3;
	}
	public void setCategory3(Category category3) {
		this.category3 = category3;
	}
	public Category getCategory4() {
		return category4;
	}
	public void setCategory4(Category category4) {
		this.category4 = category4;
	}
	public Category getCategory5() {
		return category5;
	}
	public void setCategory5(Category category5) {
		this.category5 = category5;
	}
	public Category getCategory6() {
		return category6;
	}
	public void setCategory6(Category category6) {
		this.category6 = category6;
	}
	public Category getCategory7() {
		return category7;
	}
	public void setCategory7(Category category7) {
		this.category7 = category7;
	}
	public Category getCategory8() {
		return category8;
	}
	public void setCategory8(Category category8) {
		this.category8 = category8;
	}
	public Category getCategory9() {
		return category9;
	}
	public void setCategory9(Category category9) {
		this.category9 = category9;
	}
	
}
