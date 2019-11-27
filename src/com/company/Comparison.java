package com.company;

import java.util.Scanner;

public class Comparison {
//Nr 16
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int addition;

        System.out.print("Enter first number :");
        number1 = input.nextInt();

        System.out.print("Enter second number :");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.println("The introduced numbers ar equal");


        if (number1 < number2)
            System.out.printf("%d is larger", number2);

        if (number1 > number2)
            System.out.printf("%d is larger", number1);
    }
}
