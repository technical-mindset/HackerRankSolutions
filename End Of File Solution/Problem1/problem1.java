import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner scan = new Scanner(System.in);
            int i = 1;
            String s = scan.nextLine();
            System.out.println(i+" "+s);
            while(scan.hasNextLine()){
                s = scan.nextLine();                               
               System.out.println((++i)+" "+s);
            }
            scan.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
