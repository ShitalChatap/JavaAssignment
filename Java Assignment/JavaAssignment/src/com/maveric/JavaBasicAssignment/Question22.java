package com.maveric.JavaBasicAssignment;
import java.util.Scanner;
//22.	Write a program to replace the - (Use appropriate String methods)
//a.	Original name from “Liverpool” to “Liverpool Football Club”
//b.	Original name from “City” to “Manchester City”

public class Question22 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the original name (e.g., 'Liverpool'):");
        String originalName1 = sc.nextLine();
        
        System.out.println("Enter the original name (e.g., 'City'):");
        String originalName2 = sc.nextLine();
        
     
        String replacedName1 = replaceName1(originalName1);
        System.out.println("Updated Name: " + replacedName1);
        
        
        String replacedName2 = replaceName2(originalName2);
        System.out.println("Updated Name: " + replacedName2);
        
        sc.close();
        }

	public static String replaceName1(String name) 
	{
        if (name.equalsIgnoreCase("Liverpool"))
        {
            return "Liverpool Football Club";
        }
        return name;
    }
    
    
    public static String replaceName2(String name) 
    {
    	 if (name.toLowerCase().equals("city")) 
    	 {
             return "Manchester City";
         }
        return name;
    }
}
