import java.util.*;


public class Main {
    public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();

        arr.add(5);
arr.add(5);
arr.add(6);
arr.add(2);
arr.add(3);
arr.add(7);
arr.add(7);
arr.add(7);
arr.add(1);
        
       System.out.println(candles(arr));
    

    }
       public static Integer candles(List<Integer> candles){
        Integer tCandles = Integer.MIN_VALUE;
        Map <Integer,Integer> cand = new HashMap<>();
        for (Integer c: candles) {
            if(cand.containsKey(c)){
                cand.put(c, cand.get(c) + 1);
            }
            else{
                cand.put(c, 1);
            }
        }
        for (Map.Entry<Integer,Integer> map: cand.entrySet()) {
            tCandles = Math.max(tCandles, map.getValue());
        }

        return tCandles;
    }



}
