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
            int j = p.indexOf(i+1);
            int k = p.indexOf(j+1);
            permutations.add(k+1);
        }
        return permutations;
    }
}