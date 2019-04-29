package com.kgisl.data;

import java.util.*;

public class Convert {

    public static void main(String[] args) {

        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("sasi");
        arrlist.add("sanju");
        arrlist.add("kavin");

        String array[] = new String[arrlist.size()];
        for (int j = 0; j < arrlist.size(); j++) {
            array[j] = arrlist.get(j);
        }

        for (String k : array) {
            System.out.println(k);
        }
    }
}