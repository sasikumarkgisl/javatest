package com.kgisl.data;

import java.util.Scanner;

/**
 * Game
 */
public class Game {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a * 2 + " " + ((a * 2) + 1) + " " + ((a * 2) + 2));
        } else if (a % 2 != 0) {

            System.out.println(a * 2 + " " + ((a * 2) + 1) + " " + ((a * 2) + 2));
        }

        System.out.println("Enter b:");
        b = sc.nextInt();

        if (b % 2 == 0) {
            System.out.println(b / 2 + " " + ((b / 2) / 2) + " " + ((b / 2) / 2 / 2));
        } else if (b % 2 != 0) {

            System.out.println(b / 2 + " " + ((b / 2) / 2) + " " + ((b / 2) / 2 / 2));
        }
    }

}