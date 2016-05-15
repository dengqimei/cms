package com.deng.cms.common.test;

import java.util.ArrayList;
import java.util.List;

import com.deng.cms.bean.Article;
import com.deng.cms.dao.ArticleDao;

public class Daotest {
	public static void main(String args[]){
			List<Article> list=new ArrayList<Article>();
			ArticleDao articleDao=new ArticleDao();
			list=articleDao.findByCid((long)10);
			System.out.println(list);
	}
}
