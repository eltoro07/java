package com.PreciousCornal;

import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // for increasing pattern/space -> int j=1; j <= i
        //for decreasing pattern/space -> int k=i;k<=number
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int k = i; k <= number; k++)
                System.out.print("*");

            System.out.println();
        }

    }
}
