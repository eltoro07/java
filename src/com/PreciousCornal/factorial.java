package com.PreciousCornal;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Implement a program which calculates the factorial of a number given by the user.
        //or example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24
        System.out.print("First number: ");
        int number= scanner.nextInt();

        int totalFactorial = 1;
        int factorialNum = 1;
        while (factorialNum <= number){
            totalFactorial *= factorialNum; // 1,
            factorialNum++;
        }
        System.out.println("Factorial: " + totalFactorial);
    }
}
