package com.PreciousCornal;

import java.util.Scanner;

public class positiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double positiveNumbers = 0;
        double negativeNumbers = 0;
        while (true) {
            System.out.print("Enter a number [0 to exit]: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number > 0) {
                positiveNumbers = positiveNumbers + 1;
            } else if (number < 0) {
                negativeNumbers = negativeNumbers + 1;
            }


        }
        System.out.println("The number of positives are : " + positiveNumbers);
        System.out.println("The nuumber of negatives are : " + negativeNumbers);

        double percentage = 100.0 * positiveNumbers / (positiveNumbers + negativeNumbers);
        System.out.println("Percentage of positive numbers are :"  + String.format("%.2f", percentage) + "%");
    }
}


