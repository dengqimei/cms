package com.deng.cms.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.deng.cms.bean.Category;
import com.deng.cms.service.ICategoryService;
import com.deng.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private List<Category> categoryList;
	private ICategoryService categoryService=new CategoryServiceImpl();

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
		return SUCCESS;
	}
	/**
	 * 跳转到前台首页面
	 * */
	@Action(value="toList",results={@Result(name="success",location="/WEB-INF/jsp/list.jsp")})
	public String toList(){
		categoryList=categoryService.list();
		return SUCCESS;
	}
	/**
	 * 跳转到前台首页面
	 * */
	@Action(value="toContent",results={@Result(name="success",location="/WEB-INF/jsp/content.jsp")})
	public String toContent(){
		categoryList=categoryService.list();
		return SUCCESS;
	}
}
