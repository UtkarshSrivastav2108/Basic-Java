package com.practice.main;

import java.util.Scanner;

public class function {

    public static int fact(int x) {
        int rv = 1;
        for (int i = 1; i <= x; i++) {
            rv = rv * i;
        }
        return rv;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = fact(n);


        int nmrfact = fact(n - r);

        int npr = nfact / nmrfact;
        System.out.println(npr);
    }
}
