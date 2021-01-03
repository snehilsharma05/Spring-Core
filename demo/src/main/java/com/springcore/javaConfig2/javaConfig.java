package com.springcore.javaConfig2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//Earlier we were using @ComponentScan(basePackages="") here..Now we'll not use it..Rather we'll use @Bean inside class
public class javaConfig {
	@Bean //now name of object will be getStudent which we'll use in Test.java file
	public Student getStudent()
	{
		return new Student();
	}
}
