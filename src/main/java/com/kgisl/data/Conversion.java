package com.kgisl.data;

import java.util.Scanner;

/**
 * Conversion
 */
public class Conversion {

    void convert() {
        for (int i = 0; i < 3; i++) {
            Scanner n = new Scanner(System.in);
            System.out.println("enter the selection:");
            String co = n.next();
            switch (co) {
            case "m":
                Scanner mi = new Scanner(System.in);
                System.out.println("Enter miles");
                double ms = mi.nextDouble();
                System.out.println(ms + " miles = " + milesTokm(ms) + " km");
                break;
            case "k":
                Scanner km = new Scanner(System.in);
                System.out.println("Enter kilometers");
                double ks = km.nextDouble();
                System.out.println(ks + " km = " + kmTomiles(ks) + " miles");
                Conversion c1 = new Conversion();
                c1.convert();
                km.close();
                break;
            default: {
                Conversion c = new Conversion();
            }
            }
            break;
        }
    }

    private double milesTokm(double ms) {
        return ms * 1.609;
    }

    private double kmTomiles(double ks) {
        return ks * 0.621;
    }

    public static void main(String[] args) {
        Conversion c = new Conversion();
        c.convert();
    }

}