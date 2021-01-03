package com.springcore.ci;

public class Person {
	private int personId;
	private String name;
	private Certificate certi;
	Person(int personId,String name,Certificate certi)
	{
		this.personId = personId;
		this.name = name; 
		this.certi = certi;
	}
	public String toString()
	{
		return this.personId+" : "+this.name+":{"+this.certi.name+"}";
	}
}
