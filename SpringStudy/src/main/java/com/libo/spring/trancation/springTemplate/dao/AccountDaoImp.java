package com.libo.spring.trancation.springTemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class AccountDaoImp implements AccountDao {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void inMoney(String id, double money) {
		this.jdbcTemplate.update("update account set money = (money + ?) where NAME = ?", money, id);
	}

	@Override
	public void outMoney(String id, double money) {
		this.jdbcTemplate.update("update account set money = (money - ?) where NAME = ?", money, id);
	}

}
