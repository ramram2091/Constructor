package org.constructor;

public class Company {
	public Company() {
		this(300);
	System.out.println("parent class-default constructor");
}
	public Company(int id) {
		
		System.out.println("parent class-integer Arugument Constructor");
	}
	static int q;
	static int w;
}
