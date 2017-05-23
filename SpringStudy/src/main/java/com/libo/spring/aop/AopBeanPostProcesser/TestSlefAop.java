package com.libo.spring.aop.AopBeanPostProcesser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.libo.spring.aop.AopBeanPostProcesser.service.DBQueryService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/com/libo/spring/aop/applicationContext.xml")
public class TestSlefAop {
	
	@Autowired
	DBQueryService dbqueryService;
	
	
	@Test
	public void testTransfer(){
		dbqueryService.serviceQuery();
	}
	
}
