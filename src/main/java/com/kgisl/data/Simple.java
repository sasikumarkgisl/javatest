package com.kgisl.data;

import java.util.Arrays;

/**
 * Simple
 */
public class Simple {

    public static void main(String[] args) {
        String[][] deepArray = new String[][] { { "John", "Mary" }, { "Alice", "Bob" } };

        System.out.println(Arrays.deepToString(deepArray));
    }
}