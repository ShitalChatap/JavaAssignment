package com.maveric.JavaBasicAssignment;
//13.	Write a Program to Reverse The String "Welcome To Java"?
public class Question13 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str = "Welcome To Java";

        String reversedStr = reverseString(str);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static String reverseString(String str) 
    {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }
}
