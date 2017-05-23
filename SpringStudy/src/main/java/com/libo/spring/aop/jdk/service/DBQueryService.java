package com.libo.spring.aop.jdk.service;

import com.libo.spring.aop.jdk.dao.DbQuery;
import com.libo.spring.aop.jdk.dao.DbQueryProxy;
import com.libo.spring.aop.jdk.dao.IDBquery;

/**
 * jdk动态代理的缺点: 被代理对象必须实现接口。
 */
public class DBQueryService {

	public static void main(String[] args) {
		DbQueryProxy dbQueryProxy = new DbQueryProxy();
		//生成DbQuery的被代理对象
		IDBquery dBquery = (IDBquery)dbQueryProxy.bind(new DbQuery());
		dBquery.query("123");
		System.out.println(dBquery.getClass());
	}
}
