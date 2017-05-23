package com.libo.spring.trancation.aopAdvise;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.libo.spring.trancation.aopAdvise.service.AccountInterface;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/com/libo/spring/trancation/applicationContext4.xml")
public class Demo04 {
	
	@Autowired
	private AccountInterface accountService ;
	
	@Autowired
	private DataSource dataSource ;

	@Before
	public void setUp() throws SQLException, FileNotFoundException{
		Connection connection = dataSource.getConnection();
		ScriptRunner scriptRunner = new ScriptRunner(connection);
		//scriptRunner.runScript(new FileReader("./src/main/resources/com/libo/spring/trancation/initH2.sql"));
	}
	
	@Test
	public void testTransfer(){
		accountService.transfer("caobaoyu", "libo", 200);
	}
}
