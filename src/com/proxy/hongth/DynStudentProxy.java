package com.proxy.hongth;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynStudentProxy implements InvocationHandler  {
	
	private Object target;
	
	public Object bind(Object target) {
		this.target = target;
		/**
		 * 
         * 实现动态代理的核心方法，动态代理的思路便是生成一个新类
         * 进入Proxy.newProxyInstance，可以看到核心的代码是
         * Class<?> cl = getProxyClass0(loader, intfs);
         * 然后根据生产的cl对象反射生成新的类
         * 
         * ProxyGenerator.generateProxyClass()方法来完成生成字节码的操作，
         * 这里不讲它是如何生成的，我们只要知道它可以返回一个全新的class
		 */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		
		if(arg1.getName().equals("play")) {
			System.out.println("start play");
		}
		if(arg1.getName().equals("study")) {
			System.out.println("start study");
		}
		
		arg1.invoke(target, arg2);
		System.out.println(222);
		
		
		return null;
	}

}
