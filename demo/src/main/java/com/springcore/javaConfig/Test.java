package com.springcore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
																//we'll use AnnotationConfigApplicationContext not ClassPathXmlApplicationContext
		Student s1 = context.getBean("student",Student.class);
		s1.study();
		
	}

}
