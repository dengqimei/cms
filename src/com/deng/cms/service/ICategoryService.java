package com.deng.cms.service;

import java.util.List;

import com.deng.cms.bean.Category;

/**
 * 栏目管理
 * */
public interface ICategoryService {
	//添加栏目
	void add(Category category);
	//列出所有栏目
	List<Category> list();
	//删除栏目
	void delete(long id);

}
