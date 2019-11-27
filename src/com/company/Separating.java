package com.company;

import java.util.Scanner;

public class Separating {
    //Nr 30
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter the 5-digits number :");
        number = input.nextInt();

        if (number / 10000 > 10 || number / 10000 == 0)
            System.out.print("The number hasn'n 5 digits");
        else
            System.out.printf("%d %d %d %d %d", number / 10000,
                    (number % 10000) / 1000,
                    (number % 1000) / 100,
                    (number %100) / 10,
                    number %10);
    }
}