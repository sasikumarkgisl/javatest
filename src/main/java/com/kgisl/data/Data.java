package com.kgisl.data;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * Data
 */
public class Data {

    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee(1, "sanju", "ct", 21000), new Employee(2, "sasi", "ct", 20000),
                new Employee(3, "gowtham", "it", 24000), new Employee(4, "kavin", "it", 18000),
                new Employee(5, "haja", "it", 18000));
    
    System.out.println("Total salary of all employee:" + "\n Salary:");

   
	emp.stream().filter.map(x ->(x.Salary())+"empid:"+x.empid()+"name:"+x.name()+"dept:"+x.dept()).sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}