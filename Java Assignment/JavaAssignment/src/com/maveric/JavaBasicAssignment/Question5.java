package com.maveric.JavaBasicAssignment;
//5.	Run a for loop from 500 to 1000 where if loop finds number 808 then it will print the number found as 808
public class Question5 {
	
		  public static void main(String[] args)
		  {
		        findNumberInRange(500, 1000, 808);
		    }

		    public static void findNumberInRange(int start, int end, int target)
		    {
		        for (int i = start; i <= end; i++) 
		        {
		            if (i == target) 
		            {
		                System.out.println("Number found: " + i);
		                break;
		            }
		        }
		    }
    }


