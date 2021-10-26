package com.practice.main;

import java.util.Scanner;

public class SunOfNNumbers {
    public static void main(String[] args) {
        int n;
        int sum =0;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i =1; i<=n; i++){
         sum = sum +i;
        }
        System.out.println("The Sum of" + n  + " numbers is "+ (sum));
    }




}
