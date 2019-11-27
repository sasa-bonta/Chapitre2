package com.company;

import java.util.Scanner;

public class Arithmetic {
//Nr 17
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int sum;
        int average;
        int product;

        System.out.print("Enter first number :");
        number1 = input.nextInt();

        System.out.print("Enter second number :");
        number2 = input.nextInt();

        System.out.print("Enter third number :");
        number3 = input.nextInt();

        System.out.printf("The sum is : %d%n", number1 + number2 + number3);

        System.out.printf("The average is : %d%n", (number1 + number2 + number3) / 3);

        System.out.printf("The product is : %d%n", number1 * number2 * number3);

        System.out.printf("The smallest number is : %d%n", Math.min(Math.min(number1, number2), number3));

        System.out.printf("The largest number is : %d%n", Math.max(Math.max(number1, number2), number3));
    }
}
