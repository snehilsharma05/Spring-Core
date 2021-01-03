package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		 Emp emp1 = (Emp)context.getBean("emp1");
		 System.out.println(emp1.getName()+" "+emp1.getAddresses()+" "+emp1.getPhones()+" "+emp1.getCourses());
		 
	}

}
