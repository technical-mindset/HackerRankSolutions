import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*   -------- Problem:- ------
* We use the integers a, b, and n to create the following series:
* (a + 2^0 x b),(a + 2^1 x b),(a + 2^2 x b),....(a + 2^n x b) 
*
*/

public class Solution {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 1; j < n+1; j++) {
                int temp = a;
                for (int j2 = 0; j2 < j; j2++) {
                    temp = temp +((int)(Math.pow(2,j2))*b);
                }
                System.out.print(temp+ " ");
            }
            System.out.println("\n");
        }
        in.close();
        }
    }
}

/*   -------- 0utput ------
*(-)2 6 14 30 62 126 254 510 1022 2046
*(-)8 14 26 50 98
*/
