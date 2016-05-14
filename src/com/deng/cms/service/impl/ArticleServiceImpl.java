package com.deng.cms.service.impl;

import java.util.List;

import com.deng.cms.bean.Article;
import com.deng.cms.dao.ArticleDao;
import com.deng.cms.service.IArticleService;

public class ArticleServiceImpl implements IArticleService {
	private ArticleDao articleDao=new ArticleDao();
	@Override
	public void add(Article article) {
		articleDao.save(article);
	}

	@Override
	public void deleteById(Long id) {
		articleDao.deleteById(id);
	}

	@Override
	public List<Article> list() {
		List<Article> articleList=articleDao.findAll();
		return articleList;
	}
}
