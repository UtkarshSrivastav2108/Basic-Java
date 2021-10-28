package com.practice.main;

public class Array {
    public static void main(String[] args) {
        int[] marks;
        marks = new int[5];

        marks[0]=51;
        marks[1]=61;
        marks[2]=71;
        marks[3]=81;
        marks[4]=91;

        for (int i =0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
