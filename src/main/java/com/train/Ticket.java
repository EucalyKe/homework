package com.train;

public class Ticket {
    int totalticket;
    int roundtrip;
    int total;

    public Ticket(int totalticket, int roundtrip) {
        this.totalticket = totalticket;
        this.roundtrip = roundtrip;
    }

    public void print() {
        total = ((totalticket - roundtrip) * 1000) + roundtrip * 1800;
        System.out.println("Total tickets:" + totalticket);
        System.out.println("Round-trip:" + roundtrip);
        System.out.println("Total:" + total);
    }

}
