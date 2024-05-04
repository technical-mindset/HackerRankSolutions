package org.circular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(circularArrayRotation(List.of(3,1,2), 2, List.of(1,2)));
    }
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
            Integer[] integers = a.toArray(new Integer[a.size()]); // converting the List into array
            List<Integer> in = new ArrayList<>();

            for (int j = 0; j < a.size(); j++) {
                integers[(j + k) % a.size()] = a.get(j); // adding 'k' value for avoiding the nested loop and placed integer directly to the final position
            }

            for (Integer i: queries)
                in.add(integers[i]);

            return in;

    }
}