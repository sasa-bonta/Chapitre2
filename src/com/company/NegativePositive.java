package com.company;

import java.util.Scanner;

public class NegativePositive {
    //Nr 32
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[6];
        int i=1;
        int pos=0, neg=0, zero=0;

        while (i <= 5) {
            System.out.printf("Enter number[%d] : ", i);
            number[i] = input.nextInt();
            i++;
        }

        i=1;

        for (i =1; i<=5; i++) {
            if (number[i] < 0)
                neg++;
            if (number[i] > 0)
                pos++;
            if (number[i] == 0)
                zero++;
        }

        System.out.printf("Poitive : %d%n", pos);
        System.out.printf("Negative : %d%n", neg);
        System.out.printf("Zeroes : %d%n", zero);
    }
}