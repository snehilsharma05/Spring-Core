package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired //Autowired can be appried above property,above constructor or above setter method
	@Qualifier("address2")//if there are multiple bean in Xml we can specify which bean to inject here by putting name in Qualifier
	private Address address;

	public Emp() {
		super();
	}
	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor running!!");
	}

	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting address running!");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
