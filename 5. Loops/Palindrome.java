package com.practice.main;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value");
        int n = sc.nextInt();
        int rev = 0;
        int m = n;
        int r;


        while (n > 0) {
            r = n % 10;
            n = n / 10;
            rev = (rev * 10) + r;

        }
        if (rev == m) {
            System.out.println("It is an Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");

        }

    }
}

