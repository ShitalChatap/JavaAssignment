package com.maveric.JavaBasicAssignment.Question10;

//10.	How can we access private data from one class to other class? Explain and write down the code for it?
public class AccessData 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Myclass myclass=new Myclass();
		myclass.setName("Shital");
		String name1= myclass.getName();
		
		System.out.print("accessed data:"+name1);
				
	}

}
