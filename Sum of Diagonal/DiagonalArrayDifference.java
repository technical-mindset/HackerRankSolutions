import java.util.*;

public class DiagonalArrayDifference {
    public static void main(String[] args) {
    
    // 11 2 4
    // 4 5 6
    // 10 8 -12

        List<List<Integer>> arr = new ArrayList();
        

        int result = Main()diagonalDifference();
        

    }

  public static int diagonalDifference(List<List<Integer>> arr) {
    int diag1 = 0; //arr.get(0).get(0) + arr.get(1).get(1) + arr.get(2).get(2);
    int diag2 = 0; // arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0);
    for (int i = 0; i < arr.size(); i++) {
     
       diag1 = diag1 + arr.get(i).get(i);
       diag2 = diag2 + arr.get(i).get((arr.size() - 1) - i);
       
    }
    return (diag1 > diag2 ? (diag1 - diag2) : (diag2 - diag1));

    }
}
