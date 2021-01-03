package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student s1  = context.getBean("s1",Student.class);
		System.out.println(s1);
		System.out.println(s1.getAddresses());
		System.out.println(s1.getAddresses().getClass().getName());
		System.out.println(s1.hashCode());
		System.out.println("+++++++++++++++++");
		Student s2  = context.getBean("s1",Student.class);//new different object will be created since scope is prootoype in Student.java
		System.out.println(s2);
		System.out.println(s2.getAddresses());
		System.out.println(s2.getAddresses().getClass().getName());
		System.out.println(s2.hashCode());
	}
	

}
