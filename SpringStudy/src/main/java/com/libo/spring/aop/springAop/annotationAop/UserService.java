package com.libo.spring.aop.springAop.annotationAop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	@Autowired
	private UserDaoInterface userDao ;
	
	public void save(String id){
		userDao.save("save");
	}
	
}
