package com.kgisl.data;

/**
 * Parent
 */
public class Parent {

    public Parent(){
            System.out.println("parent constructor");
    }
    static {
        System.out.println("parent static block");
    }
    {
        System.out.println("parent initialization block");
    }

}