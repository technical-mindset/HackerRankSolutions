package org.main;

public class Main {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }
    public static int viralAdvertising(int n) {
        int record = 0; // cumulative record
        int share = 5; // each share

        for (int i = 0; i < n; i++) {
            record += (share / 2);
            share = (share/2) * 3;
        }

        return record;
    }
}