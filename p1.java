package DSA.Algorithms;

import DSA.Algorithms.Sorting.Sorting;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("===============================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.print(s1);
            for(int j = s1.length(); j < 15; j++){
                System.out.print(" ");
            }
            String s = null;
            if(x < 10){
                s = "00"+String.valueOf(x);
            }
            else if (x < 100)
                s = "0"+String.valueOf(x);
            else
                s = String.valueOf(x);
            System.out.println((s));
        }
        System.out.println("================================");
/*Output
* Java     100
* Python   067
* JS       009
* */ 
    }
 
}
