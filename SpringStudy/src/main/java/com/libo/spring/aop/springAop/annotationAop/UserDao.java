package com.libo.spring.aop.springAop.annotationAop;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component
public class UserDao implements UserDaoInterface {

	@Override
	public void save(String id) {
		//((UserDaoInterface)AopContext.currentProxy()).save1(id);
		this.save1(id);
	}

	@Override
	public void save1(String id){
		System.out.println("保存用户...");
	}
}
