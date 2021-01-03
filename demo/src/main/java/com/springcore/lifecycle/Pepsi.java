package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	public double price;	
	public Pepsi() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Pepsi class Destroy method by implementing Interfaces without using xml :)");
	}

	public void afterPropertiesSet() throws Exception {//Same as Init Method
		// TODO Auto-generated method stub
		System.out.println("Pepsi class Init method by implementing Interfaces without using xml :)");
	}
	
}
