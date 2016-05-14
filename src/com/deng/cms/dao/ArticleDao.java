package com.deng.cms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.deng.cms.bean.Article;
import com.deng.cms.common.jdbc.ConnectionFactory;

public class ArticleDao {

	public void save(Article article){
		try{
			Connection conn=null;
			PreparedStatement pstmt=null;
			try{
				conn=ConnectionFactory.getConn();
				String sql="insert into t_article(title,author,content,publishDate,clickTimes,c_id) values(?,?,?,?,?,?)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, article.getTitle());
				pstmt.setString(2, article.getAuthor());
				pstmt.setString(3, article.getContent());
				pstmt.setDate(4, new Date(article.getPublishDate().getTime()));
				pstmt.setInt(5, article.getClickTimes());
				pstmt.setLong(6, article.getC_id());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void deleteById(Long id){
		try{
			Connection conn=null;
			PreparedStatement pstmt=null;
			try{
				conn=ConnectionFactory.getConn();
				String sql="delete from t_article where id=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public List<Article> findAll(){
		List<Article> list=new ArrayList<Article>();
		try{
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try{
				conn=ConnectionFactory.getConn();
				String sql="select * from t_article";
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()){
					Long id=rs.getLong("id");
					String title=rs.getString("title");
					String author=rs.getString("author");
					String content=rs.getString("content");
					Date publishDate=rs.getDate("publishDate");
					Integer clickTimes=rs.getInt("clickTimes");
					Long c_id=rs.getLong("c_id");
					Article article=new Article();
					article.setId(id);
					article.setTitle(title);
					article.setAuthor(author);
					article.setContent(content);
					article.setPublishDate(publishDate);
					article.setClickTimes(clickTimes);
					article.setC_id(c_id);
					list.add(article);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
}
