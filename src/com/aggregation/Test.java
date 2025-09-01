package com.aggregation;



class Department {
    String deptName;
    Student student;  

    Department(String deptName, Student student) {
        this.deptName = deptName;
        this.student = student; 
    }

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", student=" + student + "]";
	}
    
    
} 
class Student {
    String name;
    Student(String name){
    	this.name = name;
    	
   }
	
	public String toString() {
		return "Student [name=" + name + "]";
	}
    
}


public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("Rohit");   // Student exists independently
	     Department dept = new Department("Computer Science", s1);
	     System.out.println(s1);
	     System.out.println(dept);
	     
	}
	
	
	
	
	 
	//Aggregation = child created outside and injected → weak bond.
		//Composition = child created inside parent → strong bond.
}
