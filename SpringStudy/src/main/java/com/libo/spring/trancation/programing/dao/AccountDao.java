package com.libo.spring.trancation.programing.dao;

public interface AccountDao {

	public void inMoney(String id , double money);
	
	public void outMoney(String id , double money);
	
}
