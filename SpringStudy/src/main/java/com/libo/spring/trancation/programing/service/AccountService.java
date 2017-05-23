package com.libo.spring.trancation.programing.service;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.libo.spring.trancation.programing.dao.AccountDao;

/**
 * Spring编程式的事务Demo
 */
public class AccountService implements AccountInterface {

	private AccountDao accountDao;

	private DataSourceTransactionManager txManager;

	@Override
	public void transfer(String out, String in, double money) {
		
		DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		transactionDefinition.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
		transactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		
		TransactionStatus transactionStatus = txManager.getTransaction(transactionDefinition);
		accountDao.outMoney(out, money);
		int i = 10/0 ;
		accountDao.inMoney(in, money);
		
		txManager.commit(transactionStatus);
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTxManager(DataSourceTransactionManager txManager) {
		this.txManager = txManager;
	}

	

}
