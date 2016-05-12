package com.deng.cms.service;

import java.util.List;

import com.deng.cms.bean.Article;

public interface IArticleService {

	public void add(Article article);
	
	public void deleteById(Long id);
	
	public List<Article> list();
	
	public int count();
	
	public List<Article> findByPage(int page);
}
