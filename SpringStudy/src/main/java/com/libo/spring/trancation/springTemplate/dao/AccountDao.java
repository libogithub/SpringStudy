package com.libo.spring.trancation.springTemplate.dao;

public interface AccountDao {

	public void inMoney(String id , double money);
	
	public void outMoney(String id , double money);
	
}
