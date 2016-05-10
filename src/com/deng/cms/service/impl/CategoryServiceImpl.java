package com.deng.cms.service.impl;

import java.util.List;
import com.deng.cms.bean.Category;
import com.deng.cms.dao.CategoryDao;
import com.deng.cms.service.ICategoryService;

public class CategoryServiceImpl implements ICategoryService{
	private CategoryDao categoryDao=new CategoryDao();

	@Override
	public void add(Category category) {
		categoryDao.save(category);
	}

	@Override
	public List<Category> list() {
		return categoryDao.findAll();
	}

	@Override
	public void delete(long id) {
		categoryDao.deleteById(id);
	}
	
}
