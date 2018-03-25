package com.libo.spring.beanLifecyle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/com/libo/spring/lifecyle/applicationContext.xml")
public class BeanLifecyleTest {
	
	@Autowired
	private HelloWorld beanLifecyle ;
	
	@Test
	public void awareTest(){
		System.out.println("---"+beanLifecyle.hashCode());
	}
}
