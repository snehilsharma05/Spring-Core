package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Burger {
	private int price;

	public Burger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Burger [price=" + price + "]";
	}
	
	@PostConstruct//By default annotation are disabled we need to enable them in xml file
	public void init()
	{
		System.out.println("Init method running using Annotation: Burger ");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy method running using Annotation: Burger ");
	}	
	
}
