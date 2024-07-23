package com.maveric.JavaBasicAssignment;
//8.	String a = "Welcome To Java" , count the number of space present in the sentence and print only "Welcome" using array.
public class Question8
{
	
	public static void main(String[] args) 
	{
        String a = "Welcome To Java";

        int spaceCount = countSpaces(a);
        System.out.println("Number of spaces: " + spaceCount);
        
        printFirstWord(a);
    }

    public static int countSpaces(String str) 
    {
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ') 
            {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public static void printFirstWord(String str) 
    {
        String[] words = str.split(" ");
        if (words.length > 0) 
        {
            System.out.println("First word: " + words[0]);
        }
    }

}
