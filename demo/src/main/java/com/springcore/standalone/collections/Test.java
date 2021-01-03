package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person p1 = context.getBean("p1",Person.class);
		System.out.println(p1.getFriends());
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("+++++++++++++++++++++++++");
		System.out.println(p1.getFeeStructure());
		System.out.println(p1.getFeeStructure().getClass().getName());
		System.out.println("+++++++++++++++++++++++++");
		System.out.println(p1.getProperties());
		System.out.println(p1.getProperties().getClass().getName());
	}

}
