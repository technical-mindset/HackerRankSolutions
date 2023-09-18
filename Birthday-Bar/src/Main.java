import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list =
                List.of(1, 2, 1, 3, 2);
       
        //    List.of(1, 1, 1, 1, 1, 1);
        //        1 2 1 3 2
        System.out.println(birthday(list, 3, 2));
    }
    public static int birthday(List<Integer> s, int d, int m) {
        
        int barCount = 0, temp = 0;

        // ---- i upto s.size-m for covering all values and stops before 'm' spaces  
        for (int i = 0; i <= s.size() - m; i++) {
            
            // --- 'j' upto i+m for including the 'm' spaces from 'i'
            for (int j = i; j < (i + m); j++) {
                temp = temp + s.get(j);
            }
            if (temp == d) {
                barCount++;
            }
            temp = 0;

        }
        return barCount;

    }
}
