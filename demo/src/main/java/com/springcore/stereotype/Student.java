package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s1") //s1 will be the name of the object created...otherwise name of object is camel case representation of class (student)
@Scope("prototype") //by default scope is singleton(mns same object will be given everytime..We can use prototype,session etc.)
public class Student {
	@Value("Snehil")
	private String name;
	
	@Value("Hoshiarpur")
	private String city;
	
	@Value("#{temp}")//temp list is standalone list inside xml file
	private List<String> addresses;
	
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
}
