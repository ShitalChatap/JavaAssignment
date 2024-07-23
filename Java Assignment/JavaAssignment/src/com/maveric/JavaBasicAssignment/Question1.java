package com.maveric.JavaBasicAssignment;

import java.util.Scanner;
//1.	Write a java program to add two float numbers like 8.6 and 9.7
public class Question1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st float no");
        float num1 = sc.nextFloat();
        System.out.println("Enter 2nd float no");
        float num2 =sc.nextFloat();

        float sum = addFloats(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    
    public static float addFloats(float a, float b)
    {
        return a + b;
    }
}
