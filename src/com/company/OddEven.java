package com.company;

import java.util.Scanner;

public class OddEven {
//Nr 25
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;

        System.out.print("Enter a number :");
        number1 = input.nextInt();

        if (number1 % 2 == 1)
            System.out.print("Is odd");
        else
            System.out.print("Is even");
    }
}
