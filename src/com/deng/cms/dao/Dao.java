package com.deng.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.deng.cms.bean.Article;
import com.deng.cms.common.jdbc.ConnectionFactory;

public class Dao {
/*
	public List<Article> findById(Long c_id){
		List<Article> list=new ArrayList<Article>();
		try{
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try{
				conn=ConnectionFactory.getConn();
				String sql="select t_article.*,t_category.`name` FROM t_article "
						+ "INNER JOIN t_category ON t_article.c_id = t_category.Id "
						+ "WHERE t_article.c_id = ?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setLong(1, c_id);
				rs=pstmt.executeQuery();
				while(rs.next()){
					String name=rs.getString("name");
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
					article.setName(name);
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
	*/
	public void updateById(Long id){
		Article article=new Article();
		try{
			Connection conn=null;
			PreparedStatement pstmt=null;
			try{
				conn=ConnectionFactory.getConn();
				String sql="update t_article set title=?,author=?,c_id=?,content=? where id=? ";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, "案件复查无效");
				pstmt.setString(2, "新浪");
				pstmt.setLong(3, (long)15);
				pstmt.setString(4, "案件复查速效");
				pstmt.setLong(5, id);
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
