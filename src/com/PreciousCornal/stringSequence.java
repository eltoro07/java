package com.PreciousCornal;

import java.sql.SQLOutput;
import java.util.Scanner;

public class stringSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 0;
        System.out.print("Enter a characters: ");
        String name = (scanner.nextLine());
        int nameTwo = name.length();

        for(int i = 0; i < nameTwo; i++){
            System.out.print(name.charAt(i) + " ");
        }

    }
}


