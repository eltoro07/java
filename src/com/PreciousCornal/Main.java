package com.PreciousCornal;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
