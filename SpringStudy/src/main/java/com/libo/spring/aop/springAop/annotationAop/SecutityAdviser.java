package com.libo.spring.aop.springAop.annotationAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecutityAdviser{
	
	@Pointcut("execution(* com.libo.spring.aop.springAop.annotationAop.UserDao.*(..))")
	public void pointCut(){};

	@Before("pointCut()")
	public void secutityCheckAdvice(JoinPoint joinpoint){
		System.out.println(joinpoint.getArgs()[0]);
		System.out.println("===================安全校验===================");
	}

}
