import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] c = {0, 0, 1, 0, 0, 1, 1, 0};
//        System.out.println(c, 2);
//        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
//        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0}, 2));
        System.out.println(jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
    }

    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100, i = 0;
        while((i = (i + k) % c.length) != 0)
            energy = (c[i] == 1 ? energy - 3: energy - 1);


        // on the last iteration it jumps to the 0-th position
        energy = (c[i] == 1 ? energy - 3: energy - 1);  // and I put c[i] instead of c[0] so, the loop would be end when i = 0, this condition always runs when i = 0;
        return energy;
    }

}