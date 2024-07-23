package com.maveric.JavaBasicAssignment;
import java.util.Scanner;
//9.	Print only 12345 from below string
//"ABCDE12345"

public class Question9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String");
       
        String str = new String();
        str=sc.nextLine();
        identifyDigitfromString(str);

	}
	
	public static void identifyDigitfromString(String str)
	{
		
	
		 StringBuilder str1=new StringBuilder();
		
	
		for(int i=0;i<str.length();i++) 
		{
			 if (str.charAt(i) >= '0'&& str.charAt(i) <='9') 
			 {
				 
				 
				 str1.append(str.charAt(i));
			}
		}
		
		if(str1.length()>0)
		{
			System.out.println("Extracted digits:" + str1.toString());
		}else 
		{
			System.out.println("No digit found");	
		}
	}

}
