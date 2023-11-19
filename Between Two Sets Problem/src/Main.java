package com.solution
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
       
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(9);
        a.add(6);

        List<Integer> b = new ArrayList<>();
        b.add(36);
        b.add(72);
        
        // getting the execution time
        long t1= System.nanoTime() /1000;
        
        // System.out.println(getTotalX(a,b));
        long t2 = System.nanoTime()/1000;

        System.out.println(t2-t1);
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int factorAll = 0;
        List<Integer> setOfFactors = new ArrayList<>();
        List<Integer> multiple1 = Main.getMultiple(Main.getLeastNum(a), Main.getLeastNum(b));
        List<Integer> commonMultiple;
        if (a.size() > 1) {
            commonMultiple = Main.findCommonMultiple(multiple1, a);
        }
        else {
            commonMultiple = multiple1;
        }
        // --- convert the list into set to avoid the duplicate multiples
        Set<Integer> set = new HashSet<>();
        commonMultiple.stream().forEach(set::add);

//        commonMultiple = (a.size() > 1) ? Main.findCommonMultiple(multiple1, a) : multiple1;

        for (Integer i : set) {
            for (int j = 0; j < b.size(); j++) {
                if (b.get(j) >= i && b.get(j) % i == 0) {
                    factorAll++;
                }
            }
            //---- if the items of List a divisible by the each item of multiples List then,
            //----- the selected item added into cMultiple list
            if (factorAll == b.size()) {
                setOfFactors.add(factorAll);
            }
            factorAll = 0;
        }

        return setOfFactors.size();
    }


    // ---- finding the multiples
    public static List<Integer> getMultiple(Integer num, Integer leastNum){
        List<Integer> multiple = new ArrayList<>();
        int i = 1, mul = num;
        while (mul < leastNum) {
            mul = Math.multiplyExact(num, i++);
            multiple.add(mul);
        }
       return multiple;

    }

    // ---- finding the smallest number of list
    public static Integer getLeastNum(List<Integer> num){
        Integer leastNum = num.get(0);
        for (int i = 1; i < num.size(); i++) {
            if (leastNum > num.get(i)) {
                leastNum = num.get(i);
            }
        }
       return leastNum;
    }
    public static List<Integer> findCommonMultiple(List<Integer> multiples, List<Integer> a){
      int check = 0;
       List<Integer> cMultiple = new ArrayList<>();
//        multiples.stream().filter(num -> num % integer == 0).forEach(cMultiple::add);
        for (Integer i : multiples) {
        for (int j = 0; j < a.size(); j++) {
                if (i > 0 && i % a.get(j) == 0) {
                check++;
                }
            }
        //---- if the items of List a divisible by the each item of multiples List then,
            //----- the selected item added into cMultiple list
            if (check == a.size()) {
                cMultiple.add(i);
            }
            check = 0;
        }
        return cMultiple;
    }
}
