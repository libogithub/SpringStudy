package com.libo.spring.trancation.annotationTrans.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.libo.spring.trancation.annotationTrans.dao.AccountDao;

/**
 * 测试Spring 注解方式管理事务
 */
public class AccountService implements AccountInterface {

	private AccountDao accountDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
	public void transfer(String out, String in, double money) {
		accountDao.outMoney(out, money);
		int i = 10 / 0;
		accountDao.inMoney(in, money);
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
