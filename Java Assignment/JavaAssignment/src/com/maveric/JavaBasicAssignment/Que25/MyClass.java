package com.maveric.JavaBasicAssignment.Que25;
//25.	Write a program to create 3 overloaded constructors and print all the 3 overloaded constructors.
public class MyClass 
{

	 	private int id ;
	    private String address;
	    private String name;

	    public MyClass() 
	    {
	        this.id = 0;
	        this.address ="Default";
	        this.name= "Default";
	    }

	    public MyClass(int id)
	    {
	        this.id = id;
	        this.address = "Default";
	        this.name = "Default";
	    }

	   
	    public MyClass(int id, String address, String name)
	    {
	        this.id = id;
	        this.address = address;
	        this.name = name;
	    }

	    
	    public void printValues() 
	    {
	        System.out.println("a: " + this.id + ", b: " + this.address + ", c: " + this.name);
	    }
}
