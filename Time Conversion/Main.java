import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    System.out.println(timeConversion("04:59:59AM"));    

    }
       public static String timeConversion(String s) {
       String time = "", temp;
       int index = 0;
       try {
            temp = s.substring(s.indexOf(":"),s.indexOf("P"));
       }catch (Exception e){
            temp = s.substring(s.indexOf(":"),s.indexOf("A"));
       }finally {
            index = Integer.parseInt(s.substring(0,s.indexOf(":")));

       }

        if (s.contains("PM") && index != 12){
            time = String.valueOf(index + 12).concat(temp);
        }
        else if(s.contains("AM") && index == 12){
            time = "00".concat(temp);
        }
        else {
            time = (index/10 == 0 ? "0".concat(String.valueOf(index)).concat(temp): String.valueOf(index).concat(temp));
        }
       return time;

    }



}
