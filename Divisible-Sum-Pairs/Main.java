import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j < n; j++) {
                if ( (ar.get(i) + ar.get(i)) % k == 0) {
                    count++;
                }
            }
        }
        return count;

    }
}
