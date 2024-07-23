package com.maveric.JavaBasicAssignment;


import java.time.LocalDate;
//14.	Write a Java Program to Print Current Date and return it as a String.
public class Question14FindCurrentDate 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Question14FindCurrentDate currDate=new Question14FindCurrentDate();
        String currentDateStr = currDate.currentDateReturn();

	  System.out.print("current Date:" +currentDateStr);
	  
	}
	
	public String currentDateReturn() 
	{
		LocalDate currentDate=LocalDate.now();
		return currentDate.toString();
		
	}

}
