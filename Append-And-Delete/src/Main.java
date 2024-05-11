public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
        System.out.println(appendAndDelete("ashley", "asht", 2));
        System.out.println(appendAndDelete("zzzzz", "zzzzzzz", 4));
        System.out.println(appendAndDelete("abcd", "abcdert", 10));

    }

    public static String appendAndDelete(String s, String t, int k) {
        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();
        int index = 0;

        for (int i = 0; i < (sArr.length < tArr.length ? sArr.length: tArr.length); i++) {
            index = i;
            if (((int) sArr[i]) != ((int) tArr[i])) { // when it finds the different value
                break;
            }

        }

        int calculation = (sArr.length - index) + (tArr.length - index);

        if (calculation <= k){
            return "Yes";
        }
        return "No";
    }
}