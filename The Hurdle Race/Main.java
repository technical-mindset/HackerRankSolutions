import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(hurdleRace(1, List.of(1,2,3,3,2)));
        
    }
    public static int hurdleRace(int k, List<Integer> height) {
        
       int max = Collections.max(height);
       return max > k ? Math.abs(k - max) : 0;
        
    }
}
