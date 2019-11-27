package com.company;

import java.util.Scanner;

public class Multiples {
    //Nr 26
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int result;

        System.out.print("Enter first number :");
        number1 = input.nextInt();

        System.out.print("Enter second number :");
        number2 = input.nextInt();

        if (number2 % number1 ==0)
            System.out.printf("The first is a multiple of the second, the result is : %d%n", number2 / number1);
        else
            System.out.printf("The first is NOT multiple of the second");
    }
}
