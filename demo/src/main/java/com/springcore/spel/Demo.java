package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{2+5}")
	private int x;
	@Value("#{91+65-12}")
	private int y;
	
	@Value("#{T(java.lang.Math).PI}") //T(ClassName).STATIC_VARIABLE_NAME
	private double pi;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")//T(ClassName).STATIC_METHOD_NAME(parameters)
	private double ans; 
	
	@Value("#{8>3}")
	private boolean isActive;
	public double getAns() {
		return ans;
	}
	public void setAns(double ans) {
		this.ans = ans;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", pi=" + pi + ", ans=" + ans + ", isActive=" + isActive + "]";
	}
	
	
	
}
