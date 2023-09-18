public class Main {
    public static void main(String[] args) {
        System.out.println(kangaroo(0,3,4,2));
    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String check = "NO";

        if (v1 > v2) {
             while(x1 < x2){
                 x1 += v1;
                 x2 += v2;
             }
            while(x1 > x2){
                x1 += v1;
                x2 += v2;
            }
             check = (x1 == x2) ? "YES" : "NO";
        }

return check;
    }
}
