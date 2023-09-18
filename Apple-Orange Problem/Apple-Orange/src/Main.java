
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int s = 7, t = 10, a = 4, b = 12;
        List<Integer> apples = new ArrayList<>(Arrays.asList(2, 3, -4));
        List<Integer> oranges = new ArrayList<>(Arrays.asList(3, -2, -4));
        countApplesAndOranges(s, t, a, b, apples, oranges);

        }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int apple = 0, orange = 0;
        for (Integer item: apples) {
            if ((item + a) >= s && (item + a) <= t) {
                apple++;
            }
        }
        for (Integer item: oranges) {
            if ((item + b) >= s && (item + b) <= t) {
                orange++;
            }
            System.out.println(apple +"\n"+ orange);
        }

    }
    }

