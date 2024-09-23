package com.PreciousCornal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayNumberOccurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lists = new int[5];
        lists[0] = 2;
        lists[1] = 2;
        lists[2] = 3;
        lists[3] = 4;
        lists[4] = 3;

        System.out.print("Enter a number: ");
        int searchNumber = scanner.nextInt();

        System.out.print(searchNumber + " occured " + getNum(lists,searchNumber) + " times");
    }


    public static int getNum(int[] numbers, int searchNumber) {
        Scanner scanner = new Scanner(System.in);
        int occuranceNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (searchNumber == numbers[i]) {
                occuranceNum++;
            }
        }
        return occuranceNum;
    }

}


