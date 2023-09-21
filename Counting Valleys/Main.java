public class Main {
    public static void main(String[] args) {

        System.out.println(countingValleys(18,"DDUDUDDUDDUDDUUUUD"));
    }

    public static int countingValleys(int steps, String path) {
        int upAndDown = 0, valleys = 0;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) =='U') {
                upAndDown++;
            }
            else if (path.charAt(i) =='D'){
                
                if (upAndDown == 0) {
                    valleys++;
                }upAndDown--;

            }
        }
        for (char c: path.toCharArray()) {

            System.out.println(c);
        }


        return valleys;

    }
}
