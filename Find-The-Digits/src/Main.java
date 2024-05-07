public class Main {
    public static void main(String[] args) {
        System.out.println(findDigits(121));
    }
    public static int findDigits(int n) {
        int count = 0, number = n, d = 0;
        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            d = number % 10;

            if (d != 0 && (n % d) == 0) { // while divisor != 0 and getting mod == 0
                 count++;
            }
            number = number / 10; // by 10 so each iteration separates the single number

        }
        return d;

    }
}