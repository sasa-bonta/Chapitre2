package com.company;

public class SquaresCubes {
    //Nr 31
    public static void main(String[] args) {
        int i;

        System.out.println("number   square   cube");

        for (i = 0; i <= 10; i++){
            System.out.printf(" %4.0f   %6.0f  %6.0f%n", (float)i, Math.pow(i, 2), Math.pow(i, 3));
        }
    }
}