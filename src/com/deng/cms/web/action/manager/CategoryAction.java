package com.deng.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.deng.cms.bean.Category;
import com.deng.cms.service.ICategoryService;
import com.deng.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
;
	private String name;
	private String number;
	
	private ICategoryService categoryService=new CategoryServiceImpl();
	/**
	 * 跳转到添加栏目页面
	 * */
	@Action(value="toAddCategory",
			results={@Result(name="success",location="/WEB-INF/jsp/manager/addCategory.jsp")})
	public String toAddCategory(){
		return SUCCESS;//"success"
	}
	
	/**
	 * 跳转到栏目管理页面
	 * */
	@Action(value="toCategoryManager",
			results={@Result(name="success",location="/WEB-INF/jsp/manager/categoryManager.jsp")})
	public String toCategoryManager(){
		return SUCCESS;//"success"
	}
	
	/**
	 * 添加栏目
	 * */
	@Action(value="addCategory")
	public void addCategory(){
		Category category = new Category(null, name,number);
		categoryService.add(category);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
