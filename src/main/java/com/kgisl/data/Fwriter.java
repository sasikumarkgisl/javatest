package com.kgisl.data;

import java.io.FileWriter;
import java.io.Writer;

/**
 * Writer
 */
public class Fwriter {

    public static void main(String[] args) {
        try {
            Writer w = new FileWriter("D:\\testout.txt");
            w.write("hello");
            w.close();
        } catch (Exception e) {
            System.out.println(e); }
            System.out.println("done");
          
        }
    }
