package com.libo.spring.awareInterface;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationContext implements BeanNameAware, ApplicationContextAware {
	
	private String beanName;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		//通过重写的接口方法，获取spring容器实例context，进而获取容器中相关bean资源
        System.out.println(applicationContext.getBean(this.beanName).hashCode());
	}

	@Override
	public void setBeanName(String name) {
 		this.beanName = name;
        System.out.println("MyApplicationContext beanName:"+beanName);
	}

}
