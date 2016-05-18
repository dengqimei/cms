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
				String sql="select * from t_article order by t_article.publishDate DESC";
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
	/**
	 * 通过栏目id查询文章
	 * */
	public List<Article> findByCid(Long c_id){
		List<Article> list=new ArrayList<Article>();
		try{
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try{
				conn=ConnectionFactory.getConn();
				String sql="select t_article.*,t_category.`name` FROM t_article "
						+ "INNER JOIN t_category ON t_article.c_id = t_category.Id "
						+ "WHERE t_article.c_id = ? order by t_article.publishDate DESC";
				pstmt=conn.prepareStatement(sql);
				pstmt.setLong(1, c_id);
				rs=pstmt.executeQuery();
				while(rs.next()){
					String title=rs.getString("title");
					String author=rs.getString("author");
					String content=rs.getString("content");
					Date publishDate=rs.getDate("publishDate");
					Integer clickTimes=rs.getInt("clickTimes");
					Long id=rs.getLong("id");
					Article article=new Article();
					article.setTitle(title);
					article.setAuthor(author);
					article.setContent(content);
					article.setPublishDate(publishDate);
					article.setClickTimes(clickTimes);
					article.setId(id);
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
	/**
	 * 通过文章id查询文章
	 * */
	public Article findById(Long id){
		Article article=new Article();
		try{
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try{
				conn=ConnectionFactory.getConn();
				String sql="select t_article.*,t_category.`name` FROM t_article "
						+ "INNER JOIN t_category ON t_article.c_id = t_category.Id "
						+ "WHERE t_article.id = ?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				rs=pstmt.executeQuery();
				while(rs.next()){
					String title=rs.getString("title");
					String author=rs.getString("author");
					String content=rs.getString("content");
					Date publishDate=rs.getDate("publishDate");
					Integer clickTimes=rs.getInt("clickTimes");
					Long c_id=rs.getLong("c_id");
					article.setTitle(title);
					article.setAuthor(author);
					article.setContent(content);
					article.setPublishDate(publishDate);
					article.setClickTimes(clickTimes);
					article.setC_id(c_id);
					article.setId(id);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return article;
	}
	public void update(Article article){
		try{
			Connection conn=null;
			PreparedStatement pstmt=null;
			try{
				conn=ConnectionFactory.getConn();
				String sql="update t_article set title=?,author=?,c_id=?,"
						+ "content=?,publishDate=? where id=? ";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, article.getTitle());
				pstmt.setString(2, article.getAuthor());
				pstmt.setLong(3, article.getC_id());
				pstmt.setString(4, article.getContent());
				pstmt.setDate(5, new Date(article.getPublishDate().getTime()));
				pstmt.setLong(6, article.getId());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
