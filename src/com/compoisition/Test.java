package com.compoisition;

//Parent
class Department { 
    String deptName;
    Student student;  

    Department(String deptName) {
        this.deptName = deptName;
        this.student = new Student("Rohit"); // student created INSIDE
        // due this Strong bond
    }
}

//Child
class Student {  
    String name;
    Student(String name) { this.name = name; }
}


public class Test {
    public static void main(String[] args) {
        Department dept = new Department("Computer Science");

      //  If the Department object is destroyed, the Student object also gets destroyed
        //This means the Student’s lifecycle depends on Department’s lifecycle.
    }
}
