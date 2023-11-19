import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list =
                climbingLeaderboard(
//                        List.of(100, 100, 50, 40, 40, 20, 10),
                        List.of(100, 100, 50, 40, 40, 20, 10),
                        List.of(5, 25, 50, 120)
                );
        for (Integer i: list) {
            System.out.print(i + " ");
        }
        // 60 75 80 90 100
        // 50 65 77 90 102

    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        int totalRanks = 0;
        List<Integer> level = new ArrayList<>();

        List<Integer> Rank = new ArrayList<>(new HashSet<Integer>(ranked));
        Collections.sort(Rank, Collections.reverseOrder());

        for (int i = 0; i < player.size(); i++) {
            totalRanks = binarySearch(Rank, player.get(i));
            level.add(totalRanks + 1);
        }

      return level;

    }
    public static int binarySearch(List<Integer> list, int num){
        int start = 0, end = list.size() -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(list.get(mid) == num) {
                return mid;
            }
            else if (list.get(mid) < num) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return end + 1;
    }
}
