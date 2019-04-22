package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        int totaltickets = 0;
        int roundtrip = 0;

        while ((totaltickets != -1) && (roundtrip != -1)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number of tickets:");
            totaltickets = scanner.nextInt();

            if(totaltickets != -1) {
                System.out.println("How many round-trip tickets:");
                roundtrip = scanner.nextInt();

                if(roundtrip != -1) {
                    if(totaltickets >= roundtrip) {
                        Ticket t = new Ticket(totaltickets, roundtrip);
                        t.print();
                    } else {
                        System.out.println("Please enter again.");
                    }
                } else {
                    System.out.println("The system is end.");
                }
            } else {
                System.out.println("The system is end.");
            }
        }
    }
}
