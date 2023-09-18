import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4, 5, 5, 4, 5)));
    }
    
    public static int migratoryBirds(List<Integer> arr) {
        int count = Integer.MIN_VALUE;
        int lowestNumberFrequency = Integer.MAX_VALUE;

        //--- for taking record of numbers as keys and there count as values
        Map<Integer, Integer> mb = new HashMap<>();

        for (Integer in: arr) {

            if (mb.containsKey(in)) {
                mb.put(in, mb.get(in) + 1);
            }
            else {
                mb.put(in, 1);
            }
            if (mb.get(in) > count) {
                count = mb.get(in);
            }
        }
        for (Map.Entry<Integer,Integer> map: mb.entrySet()) {
            
            //--- when the count and frequecy matches with lowest key 
            if (map.getValue() == count && map.getKey() < lowestNumberFrequency) {
                lowestNumberFrequency = map.getKey();
            }
        }



        return lowestNumberFrequency;

    }
}
