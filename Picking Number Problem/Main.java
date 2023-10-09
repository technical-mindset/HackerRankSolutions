import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {


        System.out.println(pickingNumbers(List.of(4, 6, 5, 3, 3, 1)));
        System.out.println(pickingNumbers(List.of(1, 2, 2, 3, 1, 2)));
        System.out.println(pickingNumbers(List.of(7, 12, 13, 19, 17, 7, 3, 18, 9, 18, 13, 12, 3, 13, 7, 9, 18, 9, 18, 9, 13, 18, 13, 13, 18, 18, 17, 17, 13, 3, 12, 13, 19, 17, 19, 12, 18, 13, 7, 3, 3, 12, 7, 13, 7, 3, 17, 9, 13, 13, 13, 12, 18, 18, 9, 7, 19, 17, 13, 18, 19, 9, 18, 18, 18, 19, 17, 7, 12, 3, 13, 19, 12, 3, 9, 17, 13, 19, 12, 18, 13, 18, 18, 18, 17, 13, 3, 18, 19, 7, 12, 9, 18, 3, 13, 13, 9, 7)));
    }
    public static int pickingNumbers(List<Integer> a){
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < a.size(); i++) {
            List<Integer> newArr = new ArrayList<>();

            for (int j = 0; j < a.size(); j++) {

                if (Math.abs(a.get(i) - a.get(j)) == 0 || Math.abs(a.get(i) - a.get(j)) == 1){
                    newArr.add(a.get(j));
                }
            }

            for (int j = 0; j < newArr.size(); j++) {

                for (int k = 0; k < newArr.size(); k++) {

                    if (Math.abs(newArr.get(j) - newArr.get(k)) > 1) {
                        newArr.remove(newArr.get(k));
                    }
                }
            }
            maxVal = (newArr.size() > maxVal ? newArr.size() : maxVal);

        }


        return maxVal;

    }

}
