package com.deng.cms.common.test;

import java.sql.Connection;

import com.deng.cms.common.jdbc.ConnectionFactory;



public class ConnTest {
	public static void main(String[] args) {

	    Connection conn=ConnectionFactory.getConn();
	    System.out.println(conn);
	
	}
	
}
