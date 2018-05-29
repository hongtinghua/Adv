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
         * ʵ�ֶ�̬����ĺ��ķ�������̬�����˼·��������һ������
         * ����Proxy.newProxyInstance�����Կ������ĵĴ�����
         * Class<?> cl = getProxyClass0(loader, intfs);
         * Ȼ�����������cl�����������µ���
         * 
         * ProxyGenerator.generateProxyClass()��������������ֽ���Ĳ�����
         * ���ﲻ������������ɵģ�����ֻҪ֪�������Է���һ��ȫ�µ�class
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
