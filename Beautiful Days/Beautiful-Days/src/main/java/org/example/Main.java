package org.example;

public class Main {
    public static void main(String[] args) {

        int i = 19;
        int j = 23;
        // Range between 19 <-> 23
        System.out.println(beautifulDays(i, j, 6));
    }
    public static int mod(int a, int b, int c) {
     // taking absolute mod
        return (a < b) ? (b - a) % c :(a - b) % c;
    }
    public static int beautifulDays(int i, int j, int k) {
        String temp = "";
        int mod = 0;
        // for i to j
        for (int l = i; l <= j; l++) {
            String s = String.valueOf(l);

            // for 0 to length of 's - 1'
                for (int c = 0; c < s.length(); c++) {
                    temp += s.charAt(s.length()-c-1);
                }

            mod = mod(l, Integer.parseInt(temp), k) == 0 ? mod + 1: mod;
            temp="";
        }

        return mod;
    }


}