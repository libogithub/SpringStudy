package com.libo.spring.beanLifecyle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor {
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory)
			throws BeansException {
		// configurableListableBeanFactory.getBeanDefinition("appcontext-service.xml");
		System.out.println(
				"1.postProcessBeanFactory(BeanFactoryPostProcessor) 工厂后处理器, ApplicationContext容器初始化中refresh()中调用");
	}
}