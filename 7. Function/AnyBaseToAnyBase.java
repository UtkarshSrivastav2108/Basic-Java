package com.practice.main;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int d = getValue(n, b1, b2);
        System.out.println(d);
    }

    public static int getValue(int n, int b1, int b2) {
        int dec = AnyBaseToDecimal(n, b1);
        int dn = DecimalToAnyBase(dec, b2);
        return dn;
    }


    public static int DecimalToAnyBase(int n, int b) {
        int rv = 0;

        int p = 1;
        while(n > 0){
            int d = n % b;
            n = n / b;
            rv += p * d;
            p = p * 10;
        }
        return rv;
    }

    public static int AnyBaseToDecimal(int n, int b) {
        int rv = 0;

        int p = 1;
        while(n > 0){
            int d = n % 10;
            n = n / 10;
            rv += p * d;
            p = p * b;
        }
        return rv;
    }
}

