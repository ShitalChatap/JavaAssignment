package com.maveric.JavaBasicAssignment.Question2;

//2.	From Class_A, call/print an integer variable which is present is Class B. Where use constructor to reset the value of the variable from Class_A to Class B. 
class ClassA 
{
	 public ClassA(ClassB classB, int newValue) 
	 {
	        classB.setValue(newValue);
	    }

	 public static void main(String[] args)
	 {
	        
	        ClassB classB = new ClassB(10);
	        
	        
	        System.out.println("Initial value in Class B: " + classB.getValue());
	        
	        ClassA classA = new ClassA(classB, 20);
	        
	        
	        System.out.println("Updated value in Class B: " + classB.getValue());
	    }

}
