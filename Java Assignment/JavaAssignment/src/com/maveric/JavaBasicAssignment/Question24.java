package com.maveric.JavaBasicAssignment;
//24.	Write a program to Catch any exception in java. Use try catch and finally statements
public class Question24 
{
	
    public static void divideNumbers() 
    {
        try {
            int data = 150 / 0; 
        } catch (ArithmeticException e)
        {
           System.out.println("Exception occured: " + e); 
        }
        finally {
           
            System.out.println("Finally block executed.");
        }
    }

    public static void main(String[] args) 
    {
        divideNumbers(); 
    }

}
