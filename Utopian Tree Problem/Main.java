public class Main {
    public static void main(String[] args) {
        System.out.println(utopianTree(5));
    }

    // flag for incrementation as per requirement !!
    public static int utopianTree(int n) {
        boolean flag = true;
        int height = 0;

        for (int i = 0; i <= n; i++) {
            height = (flag == true ? height + 1 : height * 2);
            flag = (flag == true ? false : true);

        }
        return height;
    }
}
