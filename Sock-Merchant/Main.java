import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int totalCountOfSocksPair = 0;   // ---- taking record of total pairs of socks

        // --- for storing count against value as KEY --> VALUE pairs
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(ar.get(i))) {
                map.put(ar.get(i), map.get(ar.get(i))+ 1 );
            }
            else {
                map.put(ar.get(i), 1);
            }
        }

        // --- every value divided by 2 to getting actual pairs with 'INT' data-type for neglecting the decimal values
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if(m.getValue() / 2 > 0){
                totalCountOfSocksPair = totalCountOfSocksPair + (m.getValue() / 2);
            }

        }
        return totalCountOfSocksPair;

    }
}
