package com.deng.cms.common.test;

import com.deng.cms.bean.Category;
import com.deng.cms.dao.CategoryDao;

public class SaveTest {
	public static void main(String args[]){
		Category category=new Category("",1001);
		CategoryDao categoryDao=new CategoryDao();
		categoryDao.save(category);
	}

}
