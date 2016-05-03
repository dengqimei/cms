package com.deng.cms.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	/**
	 * 跳转到前台首页面
	 * */
	@Action(value="toIndex",results={@Result(name="success",location="/WEB-INF/jsp/index.jsp")})
	public String toIndex(){
		return SUCCESS;
	}
	/**
	 * 跳转到前台首页面
	 * */
	@Action(value="toList",results={@Result(name="success",location="/WEB-INF/jsp/list.jsp")})
	public String toList(){
		return SUCCESS;
	}
	/**
	 * 跳转到前台首页面
	 * */
	@Action(value="toContent",results={@Result(name="success",location="/WEB-INF/jsp/content.jsp")})
	public String toContent(){
		return SUCCESS;
	}
}
