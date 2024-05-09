import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Long.MAX_VALUE);
        extraLongFactorials(21);
    }

    public static void extraLongFactorials(int n) {
    BigInteger factorial = new BigInteger(String.valueOf(BigInteger.ONE));
        for (int i = 0; i < n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(n - i)); // multiplying the old value with 'n-1' value
        }
        System.out.println(factorial);


    }
}