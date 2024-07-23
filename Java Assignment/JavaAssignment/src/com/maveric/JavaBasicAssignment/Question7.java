package com.maveric.JavaBasicAssignment;

import java.util.Scanner;
//7.	Find the value of C in below Program and return it?
//public int returnNumber(){  
//int c = 0;
//float a = 7.8f;
//float b = 4.4f;
// c=a+b;
// return c;
 //}

public class Question7
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int c = 0;
		float a = 7.8f;
		float b = 4.4f;
		Question7 q=new Question7(); 
		System.out.print("Addition of two float no:"+q.returnNumber(a, b));

        
	}
	
	public int returnNumber(float a,float b) 
	{
		
		int c = 0;
		c=(int)(a+b);
		return c;
		
	}

}
