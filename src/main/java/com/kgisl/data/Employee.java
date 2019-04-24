package com.kgisl.data;

/**
 * Employee
 */
public class Employee {

    int empid;
    String name;
    String dept;
    float salary;

    public Employee(int empid, String name, String dept, float salary) {
        this.empid = empid;
        this.name = name;
        this.dept = name;
        this.salary = salary;   
    }
    public int empid() {
        return empid;
    }
    public String name() {
        return name;
    }
    public String dept() {
        return dept;
    }
    public float salary() {
        return salary;
    }
    public String toString() {
        return "\nempid:"+ empid + "\nname" + name + "\ndept" + dept + "\nsalary" + salary;
    }
}