package org.constructor;

public class Employee extends Company{
	//default constructor-No Argument
	public Employee() {
		this (20,"Selenium");//5
		System.out.println("It is a constructor");
	}
	//Arugument based constructor or parameterized constructor
	public Employee(int id) {//2
		this("java");//3
		System.out.println("It is a Arugument Based constructor");
	}
	public Employee (int id ,String name) {
		this("framework",300);//6
		System.out.println("Arugument Based-int,String");
	}
	public Employee(String name,int id) {//7
		super(300);
		System.out.println("Arugument Based=String integer");
	}
	public Employee(String name) {
		this();//4
		System.out.println("String Arugument based Constructor");
	}
	public static void main(String[] args) {
		Employee employee=new Employee(200);//1
		
	}
}
