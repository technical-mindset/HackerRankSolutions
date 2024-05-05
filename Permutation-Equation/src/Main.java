import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(
//                permutationEquation(List.of(4,3,5,1,2))
                permutationEquation(List.of(5,2,1,3,4))
        );

    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> permutations = new ArrayList<>();

        for (int i = 0; i < p.size(); i++) {
            int j = p.indexOf(i+1); // getting index of sequential numbers in 'p'
            int k = p.indexOf(j+1); // taking the incremented index like '1' instead of '0'
            permutations.add(k+1); // adding '1' for '1 to n' instead of 
        }
        return permutations;
    }
}
