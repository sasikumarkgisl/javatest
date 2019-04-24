package com.kgisl.data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Compar {
    public static void main(String[] args) {
        List<Employee1> details = Arrays.asList(new Employee1(100, "Sanju", 25000.50),
                new Employee1(101, "Kavin", 30000.35), new Employee1(99, "Sasi", 28000.50));
        details.forEach(System.out::println);
        System.out.println("\n ***** After Sorting *****\n");
        List<Employee1> elist = details.stream().sorted(Comparator.comparing(Employee1::empid)).collect(Collectors.toList());
        elist.forEach(System.out::println);
    }

}