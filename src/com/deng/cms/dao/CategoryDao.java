package com.deng.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.deng.cms.bean.Category;
import com.deng.cms.common.jdbc.ConnectionFactory;

/**
 * 栏目管理的数据库操作类
 * */
public class CategoryDao {

	/**
	 * 保存栏目
	 * */
	public void save(Category category){
	
		try{
			Connection conn=null;
			PreparedStatement pstmt=null;
			try{
				conn=ConnectionFactory.getConn();
				String sql="insert into t_category(name,code) values(?,?)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, category.getName());
				pstmt.setInt(2, category.getCode());
				pstmt.executeUpdate();
				
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * 遍历栏目
	 * */
	public List<Category> findAll(){
		List<Category> list=new ArrayList<Category>();
		try{
		    Connection conn=null;
		    PreparedStatement pstmt=null;
		    ResultSet rs=null;
		    try{
		    	conn=ConnectionFactory.getConn();
		    	String sql="select * from t_category";
		    	pstmt=conn.prepareStatement(sql);
		    	rs=pstmt.executeQuery();
		    	while(rs.next()){
		    		Long id=rs.getLong("id");
		    		String name=rs.getString("name");
		    		Integer code=rs.getInt("code");
		    		Category category=new Category();
		    		category.setId(id);
		    		category.setName(name);
		    		category.setCode(code);
		    		list.add(category);
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
	 * 删除栏目
	 * */
	public void deleteById(Long id){
		
	}
}
