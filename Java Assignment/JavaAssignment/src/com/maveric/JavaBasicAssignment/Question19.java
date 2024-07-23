package com.maveric.JavaBasicAssignment;
//19.	Write a program to print – (Use appropriate String methods)
//a.	Only First name from “Sachin Tendulkar”
//b.	Only Second name from “Rahul Dravid”

public class Question19 
{
	public static String extractFirstName(String fullName) 
	{

		String[] parts = fullName.split(" ");
        
        String firstname = parts[0];
        
        return firstname;
    }

    public static String extractSecondName(String fullName) 
    {
        
        String[] parts = fullName.split(" ");
        
        String secondName = parts[parts.length - 1];
        
        return secondName;
    }

    public static void main(String[] args)
    {
        String fullName1 = "Sachin Tendulkar";
        String fullName2 = "Rahul Dravid";

        String firstName = extractFirstName(fullName1);
        System.out.println("First name from \"" + fullName1 + "\": " + firstName);

        String secondName = extractSecondName(fullName2);
        System.out.println("Second name from \"" + fullName2 + "\": " + secondName);
    }

}
