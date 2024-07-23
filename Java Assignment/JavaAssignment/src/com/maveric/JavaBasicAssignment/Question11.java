package com.maveric.JavaBasicAssignment;

import java.util.HashMap;
//10.	How can we access private data from one class to other class? Explain and write down the code for it?
import java.util.Map;
public class Question11 {

	private static Map<Integer, String> employeeMap = new HashMap<>();
	
	public static void main(String[] args) 
	{
		
//		addEmployee(123, "shree");
//        addEmployee(124, "Shital");
//        addEmployee(125, "Shreyash");

      
        for (int i = 1; i <= 100; i++) 
        {
            addEmployee(i, "Employee" + i);
        }

        printEmployees();
	}
	
	
	public static void addEmployee(int empId, String empName)
	{
        employeeMap.put(empId, empName);
    }

    
    public static void printEmployees() 
    {
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet())
        {
            System.out.println("EmpId: " + entry.getKey() + ", EmpName: " + entry.getValue());
        }
    }

}
