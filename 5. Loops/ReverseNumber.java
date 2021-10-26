package com.practice.main;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();
        int r = 0;
        int rev=0;

        while (n > 0) {
            r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;


        }
        System.out.println(rev);

    }
}
