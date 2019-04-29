package com.kgisl.data;

/**
 * Employee
 */
public class Employee {

    int empid;
    String name;
    String dept;
    double salary;

    public Employee(int empid, String name, String dept, double salary) {
        this.empid = empid;
        this.name = name;
        this.dept = dept;
        this.salary = salary;   
    }
    public int  getempid() {
        return empid;
    }
    public String getname() {
        return name;
    }
    public String getdept() {
        return dept;
    }
    public double getsalary() {
        return salary;
    }
    public String toString() { 
        return "\nempid: "+ empid + "\nname " + name + "\ndept " + dept + "\nsalary " + salary;
    }
}