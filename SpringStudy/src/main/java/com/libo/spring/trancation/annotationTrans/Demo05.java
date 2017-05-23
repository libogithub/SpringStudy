package com.libo.spring.trancation.annotationTrans;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.libo.spring.trancation.annotationTrans.service.AccountInterface;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/com/libo/spring/trancation/applicationContext5.xml")
public class Demo05 {
	
	@Autowired
	private AccountInterface accountService ;
	
	@Before
	public void setUp() throws SQLException, FileNotFoundException{
	}
	
	@Test
	@Sql("classpath:/com/libo/spring/trancation/initH2.sql")
	public void testTransfer(){
		accountService.transfer("caobaoyu", "libo", 200);
	}
}
