package com.libo.spring.aop.AopBeanPostProcesser.beanPostProcesser;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.libo.spring.aop.AopBeanPostProcesser.dao.DBQueryProxy;
import com.libo.spring.aop.AopBeanPostProcesser.dao.OrgQuery;
import com.libo.spring.aop.AopBeanPostProcesser.dao.UserQuery;

import net.sf.cglib.proxy.Enhancer;

/**
 * 模拟Spring自己的动态代理方式。
 * 在Bean初始化完成以后通过cglib生成一个代理对象
 */
@Component
public class DBBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	/**
	 * 使用cglib模拟springaop的实现
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("userQuery".equals(beanName)){
			return createPoxy(new UserQuery());
		}else if("orgQuery".equals(beanName)){
			return createPoxy(new OrgQuery());
		}
		return bean;
	}
	
	public <T> T createPoxy(Object obj) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(new DBQueryProxy(obj));
		return (T) enhancer.create();
	}

}
