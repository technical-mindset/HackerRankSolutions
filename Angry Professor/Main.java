import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                angryProfessor(
                        3,
                        Arrays.asList(-1, -3, 0, 4, 1)
                ));
    }
    public static String angryProfessor(int k, List<Integer> a) {
        int count = 0;
        for (int i : a) {
            if(i <= 0)
                count++;
        }
        return (count >= k ? "NO": "YES");

    }
}
