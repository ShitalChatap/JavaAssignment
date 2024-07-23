package com.maveric.JavaBasicAssignment;

import java.util.Scanner;
//3.	Write a java program which will throw an exceptopn error for an AGE field if we pass age below 25 and above 55.
public class Question3 
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a age:");
        int age=sc.nextInt();
               try {
            ageIdentify(age);
        } 
               catch (AgeOutOfRangeException e) 
               {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
       
	}
	
	 public static void ageIdentify(int age) throws AgeOutOfRangeException 
	 {
	        if (age <= 25 || age >= 55)
	        {
	            throw new AgeOutOfRangeException("Age must be between 25 and 55.");
	        } 
	        else 
	        {
	            System.out.println("Valid age: " + age);
	        }
	    }
	
	static class AgeOutOfRangeException extends Exception 
	{
        public AgeOutOfRangeException(String message)
        {
            super(message);
        }

}
	
}
