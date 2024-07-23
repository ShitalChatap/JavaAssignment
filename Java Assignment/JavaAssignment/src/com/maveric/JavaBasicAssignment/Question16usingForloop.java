package com.maveric.JavaBasicAssignment;
//16.	Write a program to print 100 numbers using,

//b.	For loop

public class Question16usingForloop
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Question16usingWhileLoop Q16=new Question16usingWhileLoop();
		Q16.printhundreadno();
	}
	
	public void printhundreadno() 
	{
		
		for(int i=0;i<100;i++) 
		{
			System.out.println(i);
		}
	}

}
