package com.PreciousCornal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
A program that replaces the odd elements of an array before the even elements
a tempLists was created to sort all the odd & even numbers
and copied the tempLists to the original lists array variable
 */
public class sortOddEvenArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lists = {1,2,4,5,7,9,-2,3};

        int[] tempLists = new int[lists.length];
        int j = 0;
        int k = lists.length-1;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] % 2 == 0)
                tempLists[k--] = lists[i]; // tempLists[k--] is equal to k - 1 inside the index
            else
                tempLists[j++] = lists[i]; // tempLists[j++] is equal to j + 1 inside the index
        }
        copyArray(tempLists, lists);
        System.out.print(Arrays.toString(lists));
    }

    public static void copyArray(int[] temp, int[] number){
        for(int i = 0; i < temp.length; i++)
            number[i] = temp[i];
    }

}


