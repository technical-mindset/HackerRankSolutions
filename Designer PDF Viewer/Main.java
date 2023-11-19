import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(designerPdfViewer(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
                "zaba"));
    }
    public static int designerPdfViewer(List<Integer> h, String word) {
        int high = 0;
        for (int i = 0; i < word.length(); i++) {
            high = Math.max(high, h.get(((int) word.charAt(i) - 97)));
            System.out.println(high);
        }
        return high * word.length();
    }
}
