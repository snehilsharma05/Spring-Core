package com.springcore.lifecycle;

public class Samosa {
	private double price;

	
	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Data!!!");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init()//name can be any name
	{
		System.out.println("Inside Init Method..");
	}
	public void destroy()//name can be any name..Register these methods inside Xml file
	{
		System.out.println("Inside Destroy Method..");
	}
}
