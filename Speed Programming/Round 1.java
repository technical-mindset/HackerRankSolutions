import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


       // Question 1
//        System.out.print("Enter Number of days: ");
//        Main.NumToDay(scanner.nextInt());

        // Question 2
//        Main.tournament();

//          Question 3
//        Main.isMagic(1729);

        //  Question 4
//        Main.lottery(71);

        //  Question 5
//        Main.Ques5();

    }

    // Question 1
    public static void NumToDay(int day){
        String[] days = {"Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
                "Monday",
                "Tuesday"
        };
        System.out.println(days[(day%7)]);
    }

    // Question 2

    public static void tournament() {
        int [] result = {0,0};

        System.out.print("Enter number of tournament -->");
        int numOfTourn = scanner.nextInt();
        System.out.print("Enter MATCHES -->");
        String match = scanner.next();

        // iterate for (numOfTourn * 2) because checking of couple of words so increment with +2
        for (int i = 0; i <numOfTourn*2; i = i + 2) {
            if (match.charAt(i) == match.charAt(i+1)) {
                System.out.println("DRAW");
            }
            else {
                if ((match.charAt(i)=='R')) {
                    System.out.println("A WINS");
                    result[0] = result[0] + 1;
                }
                else if (match.charAt(i+1)=='R') {
                    System.out.println("B WINS");
                    result[1] = result[1] + 1;
                }
                else if (match.charAt(i)=='S') {
                    System.out.println("A WINS");
                    result[0] = result[0] + 1;

                }
                else if (match.charAt(i+1)=='S') {
                    System.out.println("B WINS");
                    result[1] = result[1] + 1;
                }
            }
        }
        System.out.println(result[0] > result[1] ? "A WINS TOURNAMENT": "B WINS TOURNAMENT");
    }

    // Question 3
    public static void isMagic(int n){
        int num = n;
        int i = 0;
        // breaking number and add the parts of it
     while(n > 9){
         i = i + (n % 10);
         n = n / 10;
     }
     i = i + n;

     // reverse the number
     String s = String.valueOf(i);
     char arr [] = s.toCharArray();
        s = "";

        for (int j = 0; j < arr.length; j++) {
            s = s + arr[arr.length-j-1];
        }

        n = Integer.parseInt(s);
        n = n*i;
        System.out.println(num == n ? "Magic number": "Not a magic Number");
    }

    // Question 4
    public static void lottery(int num){
        Random random = new Random();
        int n = random.nextInt(90) + 10;

        String s = String.valueOf(num);
        String st =  String.valueOf(n);
        if (n == num) {
            System.out.println("The lottery number: " + n + "\n You won $10,000");
        }
        else if (s.charAt(0) == st.charAt(1) && s.charAt(1) == st.charAt(0)) {
            System.out.println("The lottery number: " + n +"\n Digits matched but sequence is different, you won $3,000");
        }
        else if (s.charAt(0) == st.charAt(0) || s.charAt(0) == st.charAt(1)|| s.charAt(1) == st.charAt(0) || s.charAt(1) == st.charAt(1)) {
            System.out.println("The lottery number: " + n +"\n One digit is matched you won $1,000");
        }
        else{
            System.out.println("Sorry you loose!");
        }
    }

    // Question 5
    public static void Ques5(){
        Double sum = 0.0;
        // total rows for input :
        System.out.println("Enter total number of rows:");
        int totalRow = scanner.nextInt();

        System.out.println("Enter a sequence of number :-");
        List<List<Double>> list = new ArrayList();

        for (int i = 0; i < totalRow; i++) {
            Double input = 0.0;
            // ol list for single sequence of numbers
            List<Double> ol = new ArrayList<>();
            while((input) != -1.0){
                 input = scanner.nextDouble();
                ol.add(input);
            }
            System.out.println("Next Row Begins:");
            list.add(ol);
        }

        for (List<Double> li: list) {
            for (int i = 1; i < li.size(); i++) {
                sum = sum + li.get(i);
            }
            if (sum > li.get(0)) {
                System.out.println("$"+ (sum - li.get(0)) +" SHORT");
            }
            else {
                System.out.println("ENOUGH");
            }
        }

    }


}
