package com.maveric.JavaBasicAssignment;
//20.	Write a program to - (Use appropriate String methods)
//a.	Correct the spelling mistake from “Davi Beckham” to “David Beckham”
//b.	Correct the number of goals scored by Lionel Messi from 400 to 579
public class Question20
{
	
	public static String correctName(String name) 
	{
        return name.replace("Davi", "David");
    }

    public static void main(String[] args) 
    {
        String name1 = "Davi Beckham";

        String correctedName1 = correctName(name1);
        
        System.out.println("Corrected name from \"" + name1 + "\" to \"" + correctedName1 + "\"");
    }
}
