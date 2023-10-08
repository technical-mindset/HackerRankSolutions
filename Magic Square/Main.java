import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(List.of(7, 6, 5));
        lists.add(List.of(7, 2, 8));
        lists.add(List.of(5, 3, 4));
        
        System.out.println(formingMagicSquare(lists));;
    }
    public static int formingMagicSquare(List<List<Integer>> s) {
        int count = 0, minVal = Integer.MAX_VALUE;
        int [][][] posibleSquares = {
                {
                {8, 1, 6}, {3, 5, 7}, {4, 9, 2}
        }, {    {6, 1, 8}, {7, 5, 3}, {2, 9, 4}
        }, {    {4, 9, 2}, {3, 5, 7}, {8, 1, 6}
        }, {    {2, 9, 4}, {7, 5, 3}, {6, 1, 8}
        }, {    {8, 3, 4}, {1, 5, 9}, {6, 7, 2}
        }, {    {2, 7, 6}, {9, 5, 1}, {4, 3, 8}
        }, {    {4, 3, 8}, {9, 5, 1}, {2, 7, 6}
        }, {    {4, 3, 8}, {9, 5, 1}, {2, 7, 6}
        }};

        for (int i = 0; i < 8; i++) {
            // --- getting single complete matrix 
            int [][] matrix = posibleSquares[i];

            for (int j = 0; j < matrix.length; j++) {

                int [] eachColumnOfMatrix = matrix[j];
                List<Integer> s2 = s.get(j); // --- taking each column of square

                for (int k = 0; k < s2.size(); k++) {
                    if (eachColumnOfMatrix[k] != s2.get(k)) {
                        count += Math.abs(eachColumnOfMatrix[k] - s2.get(k));
                    }
                }

            }
            minVal = (count < minVal ? count: minVal);
            count = 0;
        }
        return minVal;

    }
}
