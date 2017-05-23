package com.libo.spring.trancation.springTemplate.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.libo.spring.trancation.springTemplate.dao.AccountDao;


/**
 * 使用Spring的事务模板
 */
public class AccountService implements AccountInterface {

	private AccountDao accountDao;

	private TransactionTemplate transactionTemplate;

	@Override
	public void transfer(String out, String in, double money) {

		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				accountDao.outMoney(out, money);
				int i = 10/0 ;
				accountDao.inMoney(in, money);

			}
		});

	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

}
