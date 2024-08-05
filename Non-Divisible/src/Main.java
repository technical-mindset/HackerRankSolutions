import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Test Case 1
        System.out.println(nonDivisibleSubset(3, Arrays.asList(1, 7, 2, 4))); // Expected Output: 3

        // Test Case 2
        System.out.println(nonDivisibleSubset(2, Arrays.asList(2, 4, 5, 6, 8))); // Expected Output: 3

        // Test Case 3
        System.out.println(nonDivisibleSubset(7, Arrays.asList(14, 21, 35))); // Expected Output: 1
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        Integer[] list = s.toArray(new Integer[s.size()]); // copying the all elements into an array
        int highVal = 0, lowVal = Integer.MAX_VALUE;
        System.out.print("(");
        for (int i = 0; i < list.length; i++) {
            int temp = (list[i] % k);
            System.out.print(temp+",");

            if (temp < lowVal) {
                lowVal = temp;
            }
            else if (temp > highVal) {
                highVal = temp;
            }


        }
        System.out.print(")");

        return lowVal + highVal;
    }
}