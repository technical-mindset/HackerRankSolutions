public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(repeatedString("abac", 25)); // a = 13
        System.out.println(repeatedString("aba", 10)); // a = 7
        System.out.println(repeatedString("a", 1000000000000L)); // a = 1000000000000
        System.out.println(repeatedString("abcac", 10)); // a = 4
        System.out.println(repeatedString("abcaa", 15)); // a = 9
        System.out.println(repeatedString("abcd", 100)); // a = 25
        System.out.println(repeatedString("abac", 25)); // a = 13
        System.out.println(repeatedString("abca", 30)); // a = 15
        System.out.println(repeatedString("ba", 50)); // a = 25
        System.out.println(repeatedString("a", 1)); // a = 1
        System.out.println(repeatedString("xyz", 100)); // a = 0
        System.out.println(repeatedString("bca", 14)); // a = 4
        System.out.println(repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400L)); // a = 4


    }

    public static long repeatedString(String s, long n) {
        int len = s.length();
        long count = 0, remain =  (n % len);

        /** when the length = 1 and contains 'a' */
        if (len == 1 && s.charAt(0) == 97)
            return n;

        /** when the length = 1 and does not contain 'a' */
        else if (len == 1 && s.charAt(0) != 97)
            return 0;

        else {
            /** taking the count of 'a' */
            for (int i = 0; i < len; i++) {
                if (s.charAt(i % len) == 97) {
                    count++;
                }
            }

            /** calculating the appearance of letter 'a' */
            count = (n / len) * count;

                if (remain > 0) {
                    for (int i = 0; i < remain; i++) {

                        if (s.charAt(i % len) == 97) {
                            count++;
                        }
                    }
                }
            return count;
        }
    }
    /** Old concrete logic which is not optimize for large data sets (taking O(n2) time) */
//    public static long repeatedString(String s, long n) {
//        int len = s.length(), count = 0;
//        /** when the length = 1 and contains 'a' */
//        if (len == 1 && (int) s.charAt(0) == 97)
//            return n;
//
//        /** when the length = 1 and does not contain 'a' */
//        else if (len == 1 && (int) s.charAt(0) != 97)
//            return 0;
//
//        else
//        for (int i = 0; i < n; i++) {
//            if ((int) s.charAt(i % len) == 97) {
//                count++;
//            }
//        }
//        return count;
//    }

}