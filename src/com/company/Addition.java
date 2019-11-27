package com.company;

import java.util.Scanner;

public class Addition {
//Nr 15
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int addition;

        System.out.print("Enter first number :");
        number1 = input.nextInt();

        System.out.print("Enter second number :");
        number2 = input.nextInt();

        addition = number1 + number2;

        System.out.printf("The sum is : %d%n", addition);
    }
}
