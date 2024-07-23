package com.maveric.JavaBasicAssignment;

import java.util.Scanner;
//4.	Write a function which accepts 3 parameters. 2 integers and 1 String. If String parameter is 'add' then it would add two integers. Similarly 'subs'/'multiplication'/'division'.
public class Question4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st no");
        int a=sc.nextInt();
        
        System.out.println("Enter 2nd no");
        int b=sc.nextInt();
        
        System.out.println("Enter string value like add/subs/multiplication/division)");
        String c=sc.next();
        
        Question4 q=new Question4();
        int result = q.performOprations(a,b,c);
        
        System.out.println("Result: " + result);
        sc.close();
        
	}
	
	public int performOprations(int a,int b,String c) 
	{


	        switch (c) 
	        {
	            case "add":
	               return a+b;
	              
	            case "subs":
	                return a-b;
	              
	            case "multiplication":
	            	 return a*b;
	               
	            case "division":
	            	if (b != 0)
	            	
	            	
	            	{
	                    return a / b;
	                } 
	            	else 
	                {
	                    System.out.println("Error: Division by zero");
	                    return 0; 
	                }
	            default:
	                System.out.println("Invalid string");
	                return 0;
	        }
		
	}

}
