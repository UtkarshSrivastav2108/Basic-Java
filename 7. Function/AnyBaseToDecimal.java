package com.practice.main;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int b = sc.nextInt();

        int rv = 0;
        int p =1;
        while (d > 0) {
            int dig = d % 10;
            d = d / 10;
            rv+= dig*p;
            p=p*b;


        }

        System.out.println(rv);

    }
}
