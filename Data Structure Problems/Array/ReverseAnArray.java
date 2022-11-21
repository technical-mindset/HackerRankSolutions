import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Result {

    /*
     * Complete the 'reverseArray' function below.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
     Integer[] array = new Integer[a.size()];
     array = a.toArray(array);
     int temp = 0;
    for (int i = 0, j = array.length-1; i < (array.length/2); i++,j--) {
    temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    }
    a = Arrays.asList(array);
      return a;
    }

}

