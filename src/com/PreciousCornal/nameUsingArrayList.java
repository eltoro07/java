package com.PreciousCornal;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class nameUsingArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while(true) {
            System.out.print("Add a name: [0 to exit]:" );
            String names = scanner.nextLine();
            list.add(names);

            if (names.equals("0")){
                break;
            }
        }
        System.out.println("Word that contains \"ana\" are:");
        printName(list);
        System.out.println(list.size());;
    }

    public static void printName(ArrayList<String> theNames){
        for (String myList: theNames) { //theNames is an array where the inputted names are stored
            if (myList.contains("ana")) {
                System.out.println(myList);
            }
        }
    }


}