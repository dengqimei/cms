package com.deng.cms.service;

import java.util.List;

import com.deng.cms.bean.Article;

public interface IArticleService {

	public void add(Article article);
	
	public void deleteById(Long id);
	
	public List<Article> list();
	
	public List<Article> findByCid(Long c_id);
	
	public List<Article> findById(Long id);
}
