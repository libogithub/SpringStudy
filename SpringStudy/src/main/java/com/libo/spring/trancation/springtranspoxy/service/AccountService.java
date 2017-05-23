package com.libo.spring.trancation.springtranspoxy.service;

import com.libo.spring.trancation.springtranspoxy.dao.AccountDao;


/**
 * 测试Spring的事务代理的功能，请查看xml的配置
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
