public class Main {
    public static void main(String[] args) {
        int [] keyboard = {40,50,60},
        drives = {5,8,12};

        System.out.println(getMoneySpent(keyboard, drives, 60));

    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int purchased = -1, temp = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                temp = keyboards[i] + drives[j];
                if (temp <= b) {
                    if (temp > purchased) {
                        purchased = temp;
                    }
                }
            }
        }
        return purchased;


    }
}
