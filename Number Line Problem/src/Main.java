import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> list = breakingRecords(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));
        list.forEach(System.out::println);

    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
              
        /* --- taking record of how many greater and lesser values appeared in
           --- the scores */
        int highestScoreCount = 0, lowestScoreCount = 0,
                highestValue, lowestValue = highestValue = scores.get(0);
        
        for (Integer score: scores) {
            
            if (score > highestValue) {
                highestValue = score;
                highestScoreCount++;
            }
            else if (score < lowestValue) {
                lowestValue = score;
                lowestScoreCount++;
            }
        }
        return Arrays.asList(highestScoreCount, lowestScoreCount);
    }
}
