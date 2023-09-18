import java.util.*;

public class Main {
    public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
arr.add(793810624);
arr.add(895642170);
arr.add(685903712);
arr.add(623789054);
arr.add(468592370);
miniMaxSum();    

    }
        public static void miniMaxSum(List<Integer> arr) {

        Long minSum = Long.MAX_VALUE;
        Long maxSum = Long.MIN_VALUE;

        List<Long> temp = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            temp.add(0L);
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i != j  ) {
                    temp.set(i, temp.get(i) + arr.get(j)) ;
                }
            }
                maxSum = Math.max(maxSum , temp.get(i));
                minSum = Math.min(temp.get(i) , minSum);

        }
        System.out.println(minSum +" " + maxSum);
    }


}
