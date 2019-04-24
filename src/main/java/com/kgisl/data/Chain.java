package com.kgisl.data;

/**
 * Chain
 */
public class Chain {
    public int empid;
    public String name;
    public float salary;

    public Chain(int empid, String name, float salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public Chain() {

        this(1235);

    }

    public Chain(int empid) {

        this(empid, 10000);
    }

    public Chain(int empid, float salary) {

        this(empid, "Sasi", salary);

    }

    void display() {
        System.out.println("ID:    " + empid);
        System.out.println("Name:  " + name);
        System.out.println("Salary:   " + salary);
    }

    public static void main(String[] args) {
        Chain var = new Chain();
        var.display();
    }
}
