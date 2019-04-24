package com.kgisl.data;

/**
 * Employee1
 */
public class Employee1 {

    int empid;
    String name;
    //String dept;
    double salary;

    public Employee1(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        
        this.salary = salary;   
    }
    public int empid() {
        return empid;
    }
    public String name() {
        return name;
    }
  
   
    public double salary() {
        return salary;
    }
    public String toString() {
        return "\nempid:"+ empid + "\nname" + name + "\nsalary" + salary;
    }
}