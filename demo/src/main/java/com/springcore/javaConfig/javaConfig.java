package com.springcore.javaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //this tells that we are not using xml file..All configurations will be present inside this java file
@ComponentScan(basePackages="com.springcore.javaConfig")//earlier we were passing base package inside xml..Now we'll use annotation 
public class javaConfig {
	
}
