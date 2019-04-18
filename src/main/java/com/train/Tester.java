package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int i = 0;
        while (i > -1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number of tickets:");
            int totaltickets = scanner.nextInt();
            System.out.println("How many round-trip tickets:");
            int roundtrip = scanner.nextInt();
            if(totaltickets > roundtrip) {
                Ticket t = new Ticket(totaltickets, roundtrip);
                t.print();
            } else {
                System.out.println("Please enter again.");
            }
        }

    }
}
