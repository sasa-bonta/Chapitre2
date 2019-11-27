package com.company;

import java.util.Scanner;

public class Circumference {
    //Nr 28
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rase;

        System.out.print("Enter the rase :");
        rase = input.nextInt();

        System.out.printf("Diameter is : %d%n", rase * 2);

        System.out.printf("Circumference is : %f%n", rase * 2 * Math.PI);

        System.out.printf("Area is : %f%n", Math.PI * Math.pow(rase, 2));
    }
}