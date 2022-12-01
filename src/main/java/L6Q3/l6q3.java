package L6Q3;

import java.util.Random;

public class l6q3 {
    static int[] reverse(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            while (a[i] != 0) {
                b[i] = b[i] * 10 + a[i] % 10;
                a[i] /= 10;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Random rng = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rng.nextInt(10000);
        }
        for (int k : a) {
            System.out.print(k + " ");
        }
        int[] b = reverse(a);
        System.out.println();
        for (int j : b) {
            System.out.print(j + " ");
        }
    }
}
