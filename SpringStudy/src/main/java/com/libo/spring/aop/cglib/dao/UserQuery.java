package com.libo.spring.aop.cglib.dao;

public class UserQuery implements IUserQuery {
	
	public void query(String id){
		System.out.println("查询用户。。。");
	}
}
