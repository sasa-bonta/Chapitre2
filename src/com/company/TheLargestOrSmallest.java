package com.company;

import java.util.Scanner;

public class TheLargestOrSmallest {
//Nr 24
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        System.out.print("Enter first number :");
        number1 = input.nextInt();

        System.out.print("Enter second number :");
        number2 = input.nextInt();

        System.out.print("Enter third number :");
        number3 = input.nextInt();

        System.out.print("Enter 4th number :");
        number4 = input.nextInt();

        System.out.print("Enter 5th number :");
        number5 = input.nextInt();

        System.out.printf("The smallest number is : %d%n", Math.min(Math.min(Math.min(number1, number2),Math.min(number3, number4)), number5));

        System.out.printf("The largest number is : %d%n", Math.max(Math.max(Math.max(number1, number2),Math.max(number3, number4)), number5));
    }
}
