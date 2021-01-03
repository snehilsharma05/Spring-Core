package com.springcore.javaConfig2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
//We'll not use @Component and @ComponentScan annotations here!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		Student s1 = context.getBean("getStudent",Student.class);
		s1.study();
	}

}
