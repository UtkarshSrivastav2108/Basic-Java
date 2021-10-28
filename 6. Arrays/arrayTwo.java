package com.practice.main;

public class arrayTwo {
    public static void main(String[] args) {
        int []one = new int[5];
        one[0]=2;
        one[1]=4;
        one[2]=6;
        one[3]=8;
        one[4]=10;

        int [] two = one;
        two[2]= 120;

        for (int i =0; i< one.length; i++){
            System.out.println(one[i]);

        }


    }
}
