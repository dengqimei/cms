package com.deng.cms.dao;

import java.sql.Connection;
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
				String sql="insert into t_article(title,author,content,course,date) values(?,?,?,?,?)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, article.getTitle());
				pstmt.setString(2, article.getAuthor());
				pstmt.setString(3, article.getContent());
				pstmt.setString(4, article.getCourse());
				pstmt.setString(5, article.getDate());
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
					String course=rs.getString("course");
					String date=rs.getString("date");
					Article article=new Article();
					article.setId(id);
					article.setTitle(title);
					article.setAuthor(author);
					article.setContent(content);
					article.setCourse(course);
					article.setDate(date);
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
	public int count(){
		int count=0;
		try{
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try{
				conn=ConnectionFactory.getConn();
				String sql="select count(*) from t_article";
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				if(rs.next()){
					count=rs.getInt(1);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return count;
	}
	public List<Article> findByPage(int page){
		List<Article> list=new ArrayList<Article>();
		int pagesize=6;
		try{
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try{
				conn=ConnectionFactory.getConn();
				String sql="select * from t_article order by id asc limit ?,?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, (page-1)*pagesize);
				pstmt.setInt(2,pagesize);
				rs=pstmt.executeQuery();
				while(rs.next()){
					Article article=new Article();
					article.setId(rs.getLong("id"));
					article.setTitle(rs.getString("title"));
					article.setAuthor(rs.getString("author"));
					article.setContent(rs.getString("content"));
					article.setCourse(rs.getString("course"));
					article.setDate(rs.getString("date"));
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
