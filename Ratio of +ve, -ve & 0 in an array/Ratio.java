import java.util.*;


public class Ratio {
    public static void main(String[] args) {
     int[] arr = {0, 0, -1, 1, 1};
     
     int[] count = {0,0,0};
     
        for (int i : arr) {
            if (i > 0) {
                count[0] = count[0] + 1;
            } else if (i < 0) {
                count[1] = count[1] + 1;
            }
            else{
                count[2] = count[2] + 1;
            }
        }
        

        for (int i : count) {
            String y = (String.valueOf(((double) (i))/arr.length));

            for (int j = 0; j < 8; j++) {

                if (y.toString().length() < 8) {
                     y += ("0");
                }

                else if (y.toString().length() > 8) {
                    y = y.toString().substring(0,8);
                }

            }

            System.out.println(y);
        }

    }

}
