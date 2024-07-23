package com.maveric.JavaBasicAssignment;
//21.	Write a program to verify if the name of Cristiano Ronaldo is equal to Ronaldo Nazario (Use appropriate String methods)
public class Question21
{

	 public static boolean compareNames(String name1, String name2) 
	 {
	        return name1.equals(name2);
	    }

	    public static void main(String[] args) 
	    {
	        
	        String name1 = "Cristiano Ronaldo";
	        String name2 = "Ronaldo Nazario";

	       
	        boolean areEqual = compareNames(name1, name2);

	       
	        if (areEqual)
	        {
	            System.out.println("The names are equal.");
	        } else {
	            System.out.println("The names are not equal.");
	        }
	    }
}
