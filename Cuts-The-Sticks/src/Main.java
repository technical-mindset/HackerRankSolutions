import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // // Test Case 1
        List<Integer>  l1 = cutTheSticks(List.of(5, 4, 4, 2, 2, 8));
 // Test Case 2
        List<Integer>  l2 = cutTheSticks(List.of(1, 2, 3, 4, 3, 3, 2, 1));

 // Test Case 3
        List<Integer>  l3 = cutTheSticks(List.of(1, 1, 1, 1));

 // Test Case 4
        List<Integer>  l4 = cutTheSticks(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

 // Test Case 5
        List<Integer>  l5 = cutTheSticks(List.of(10, 10, 10));

 // Test Case 6
        List<Integer>  l6 = cutTheSticks(List.of(1, 2, 1, 2, 1, 2, 1, 2));

 // Test Case 7
        List<Integer>  l7 = cutTheSticks(List.of(5, 4, 3, 2, 1));

 // Test Case 8
        List <Integer> l8 = cutTheSticks(List.of(8, 8, 8, 8, 8, 8, 8, 8, 8, 8));

 // Test Case 9
        List<Integer>  l9 = cutTheSticks(List.of(3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3));

 // Test Case 10
        List<Integer>  l0 = cutTheSticks(List.of(5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5));

        System.out.print("--------------------\n{");
        System.out.print( " ");

        for (Integer i: l0){
            System.out.print(i+ " ");
        }
        System.out.println("}\n--------------------");



    }

    public static List<Integer>cutTheSticks(List<Integer> arr) {

        Integer[] list = arr.toArray(new Integer[arr.size()]);
        List cuts = new ArrayList();

        int minVal = Integer.MAX_VALUE;
        int count = 0;

        for (int k = 0; k < list.length; k++) {

            // Retrieving the smallest value in an array
            for (int i = 0; i < list.length; i++) {
                int arrValue = list[i];

                if(minVal > arrValue && arrValue != 0){
                    minVal = arrValue;
                }
            }

            // Reducing the array's non-zero value by minimum value in array
            for (int i = 0; i < list.length; i++) {
                int arrValue = list[i];

                if (minVal <= arrValue) {
                    list[i] = arrValue - minVal;
                    count++;
                }
            }

            if (count > 0) { // adding only non-zero integers
                cuts.add(count);
            }

            minVal = Integer.MAX_VALUE;
            count = 0;
        }
        return cuts;
    }
}