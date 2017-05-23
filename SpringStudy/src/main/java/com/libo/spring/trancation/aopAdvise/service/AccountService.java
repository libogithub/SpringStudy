package com.libo.spring.trancation.aopAdvise.service;

import com.libo.spring.trancation.aopAdvise.dao.AccountDao;

/**
 * 测试Spring Aop 管理事务
 */
public class AccountService implements AccountInterface {

	private AccountDao accountDao;

	@Override
	public void transfer(String out, String in, double money) {
		accountDao.outMoney(out, money);
		int i = 10/0 ;
		accountDao.inMoney(in, money);
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
