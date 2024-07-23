package com.maveric.JavaBasicAssignment.Que25;

public class printConstructor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		 MyClass obj1 = new MyClass();
	        MyClass obj2 = new MyClass(100);
	        MyClass obj3 = new MyClass(200, "Pune", "Shital");
	        
	        System.out.println("Object 1:");
	        obj1.printValues();
	        System.out.println("Object 2:");
	        obj2.printValues();
	        System.out.println("Object 3:");
	        obj3.printValues();
	    

	}

}
