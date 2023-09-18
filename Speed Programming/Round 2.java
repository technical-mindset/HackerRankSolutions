
import java.util.HashMap;
import java.util.Map;

public class Round2 {

    // Question 1:
    public static void currencyExchange(int curr){
        Map<Integer,Integer> map = new HashMap<>();
        while(curr > 0){
            if (curr >= 5000) {
                curr = curr - 5000;
                map.put(5000, (map.containsKey(5000) ? map.get(5000) + 1 : 1));
            }
            else if (curr >= 1000) {
                curr = curr - 1000;
                map.put(1000, (map.containsKey(1000) ? map.get(1000) + 1 : 1));
            }
            else if (curr >= 500) {
                curr = curr - 500;
                map.put(500, (map.containsKey(500) ? map.get(500) + 1 : 1));
            }
            else if (curr >= 100) {
                curr = curr - 100;
                map.put(100, (map.containsKey(100) ? map.get(100) + 1 : 1));
            }
            else if (curr >= 50) {
                curr = curr - 50;
                map.put(50, (map.containsKey(50) ? map.get(50) + 1 : 1));
            }
            else if (curr >= 20) {
                curr = curr - 20;
                map.put(20, (map.containsKey(20) ? map.get(20) + 1 : 1));
            }
            else if (curr >= 10) {
                curr = curr - 10;
                map.put(10, (map.containsKey(10) ? map.get(10)+1 : 1));
            }
            else if (curr >= 5) {
                curr = curr - 5;
                map.put(5, (map.containsKey(5) ? map.get(5) + 1 : 1));
            }
            else if (curr >= 2) {
                curr = curr - 2;
                map.put(2, (map.containsKey(2) ? map.get(2) + 1 : 1));
            }
            else if (curr >= 1) {
                curr = curr - 1;
                map.put(1, (map.containsKey(1) ? map.get(1) + 1 : 1));
            }
        }
        for (Map.Entry<Integer,Integer> m: map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }

    // Question 2 :
    public static void BinToDeci(String binNum){
        if (binNum.length() > 8) {
            System.out.println("Required length is less than 8.");
        }
        else {
            double deciNum = 0;
            for (int i = 0; i < binNum.length(); i++) {
                /*
                Taking power of 2 from '0' to length of binNum,
                Convert each bit of binNum to double,
                Iterate reverse and add the value into deciNum
                */
                deciNum = deciNum + ( Double.parseDouble(""+binNum.charAt(binNum.length()-i-1)) * Math.pow(2, i) );
            }
            System.out.println("In Decimal: "+(int) (deciNum));
        }
    }

    // Question 3 :-
    public static void remainTime(){
        System.out.println("Enter Time :-");
        String time = Main.scanner.nextLine();
        String [] timeArr = time.split(" ");
        int hours =
                Integer.parseInt(String.valueOf(timeArr[0].charAt(0)) + String.valueOf(timeArr[0].charAt(1)))
                        - Integer.parseInt(String.valueOf(timeArr[1].charAt(0)) + String.valueOf(timeArr[1].charAt(1)));
        int minutes =
                Integer.parseInt(String.valueOf(timeArr[0].charAt(3)) + String.valueOf(timeArr[0].charAt(4)))
                        - Integer.parseInt(String.valueOf(timeArr[1].charAt(3)) + String.valueOf(timeArr[1].charAt(4)));
        int seconds =
                Integer.parseInt(String.valueOf(timeArr[0].charAt(6)) + String.valueOf(timeArr[0].charAt(7)))
                        - Integer.parseInt(String.valueOf(timeArr[1].charAt(6)) + String.valueOf(timeArr[1].charAt(7)));

        hours = (hours > 0 ? hours : (hours*(-1)));
        minutes = (minutes > 0 ? minutes : (minutes*(-1)));
        seconds = (seconds > 0 ? seconds : (seconds*(-1)));
        System.out.println(hours +" HOURS "+ minutes +" MINUTES "+ seconds +" SECONDS ");
    }

    // Question 04 :-
    public static void letterPosition(){
        System.out.print("Enter number of rows:- \n-->");
        String[] arr = new String[Main.scanner.nextInt()+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Main.scanner.nextLine();
            arr[i] = arr[i] + " ";
        }
        for (int i = 0; i < arr.length; i++) {

            int row = arr[i].length(); // how many rows should be print for each word
            int start = 0; // beginning index for printing the character
            int end = 1; // ending index
            int spaces = arr[i].length();

            for (int j = 0; j < (row * 2); j++) {
                for (int k = 0; k < (spaces-2); k++) {
                    System.out.print(" ");
                }

                for (int k = start; k < end; k++) {
                    System.out.print(arr[i].charAt(k));
                }
                System.out.println();

                end = (end == arr[i].length()  ? end : end + 1); // if 'end'!= length of letter then it would be increment
                start = (end < arr[i].length() ? start: start + 1); //if 'end'< length of letter then it would be increment
                spaces = (end < arr[i].length() ? spaces - 1: spaces);
            }
        }

    }
}
