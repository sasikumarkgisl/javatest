package com.kgisl.data;

/**
 * Child
 */
public class Child  {
    {
        System.out.println("child initialisation block");
    }
    static {
        System.out.println("child static block");
    }
 
    public Child() {
        System.out.println("child constructor");
    }
    public static void main(String[] args) {
        new Child();
    }
 }