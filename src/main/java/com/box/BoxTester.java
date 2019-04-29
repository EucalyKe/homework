package com.box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Box box3Size = new Box3(23, 14, 13);
        Box box5Size = new Box5(39.5f, 27.5f, 23.0f);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter objcet's length:");
        int length = scanner.nextInt();
        System.out.println("Please enter objcet's width:");
        int width = scanner.nextInt();
        System.out.println("Please enter objcet's height:");
        int height = scanner.nextInt();

        if(box3Size.validate(length, width, height)){
            System.out.println("Box3");
        } else if(box5Size.validate(length, width, height)) {
            System.out.println("Box5");
        } else {
            System.out.println("No suitable box.");
        }
    }
}
