package com.maveric.JavaBasicAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
//6.	Write a program where create an int type arraylist object. Then add 200 to 500 numbers into the ArrayList then Print the ArrayList.
//a.	Perform the same for HashSet and print
//b.	Perform the same for TreeSet and print


public class Question6 
{
	
	public static void main(String[] args) 
	{
		Question6 P = new Question6();
 
        P.handleArrayList();
        P.handleHashSet();
        P.handleTreeSet();
    }

    public void handleArrayList() 
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int i = 200; i <= 500; i++) 
        {
            arrayList.add(i);
        }
        
        System.out.println("ArrayList:"+arrayList);
        
    }

    public void handleHashSet()
    {
        HashSet<Integer> hashSet = new HashSet<>();
        
        for (int i = 200; i <= 500; i++) 
        
        {
            hashSet.add(i);
        }
        
        System.out.println("HashSet:"+hashSet);
       
    }

    public void handleTreeSet() 
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        for (int i = 200; i <= 500; i++) 
        {
            treeSet.add(i);
        }
        
        System.out.println("TreeSet:"+treeSet);
       
    }


}
