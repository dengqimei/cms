package com.deng.cms.common.test;

import com.deng.cms.dao.Dao;

public class Daotest {
	public static void main(String args[]){
		Dao dao=new Dao();
		Long id=(long)8;
		dao.updateById(id);
	}
}
