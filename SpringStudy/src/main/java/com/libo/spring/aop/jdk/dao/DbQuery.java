package com.libo.spring.aop.jdk.dao;

public class DbQuery implements IDBquery {
	
	public void query(String id){
		System.out.println("查询数据库。。。");
	}
}
