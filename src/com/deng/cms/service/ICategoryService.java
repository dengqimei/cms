package com.deng.cms.service;

import java.util.List;

import com.deng.cms.bean.Category;


public interface ICategoryService {
	void add(Category category);
	//列出所有栏目
	List<Category> list();
	//删除栏目
	void delete(long id);

}
