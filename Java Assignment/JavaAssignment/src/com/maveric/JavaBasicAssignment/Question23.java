package com.maveric.JavaBasicAssignment;
import java.util.Scanner;
//23.	Write a program to print “Narendra Modi” to - (Use appropriate String methods)
//a.	UpperCase & the LowerCase

public class Question23 
{

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String str=sc.nextLine();
		
		String upperstr =Question23.upperString(str);
		
		System.out.println("Uppercase String:" +upperstr );
		
		String lowerstr =Question23.lowerString(str);
		System.out.println("Lowercase String:" +lowerstr );
		sc.close();
		
	}
	
	public static String upperString(String str) 
	{
		 return str.toUpperCase();
	}
	public static String lowerString(String str)
	{
		 return str.toLowerCase();
	}

}
