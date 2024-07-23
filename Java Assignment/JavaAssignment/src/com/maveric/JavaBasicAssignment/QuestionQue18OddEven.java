package com.maveric.JavaBasicAssignment;

import java.util.Scanner;

public class QuestionQue18OddEven 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter number:");
		int num=sc.nextInt();
		
		QuestionQue18OddEven.OddEven(num);
	}
	
	public static void OddEven(int num) 
	{
		if(num%2==0)
		{
			System.out.println("This is even number:"+num);
		}else 
		{
			System.out.println("This is odd number:"+num);
		}
		
		
	}
}
