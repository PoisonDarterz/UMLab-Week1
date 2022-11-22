package L4Q6;

import java.util.Random;

public class l4q6 {
    public static void main(String[] args) {
        Random rng = new Random();
        int num = rng.nextInt(0, 2147483647);
        System.out.println("The random number is " + num);
        int digits = (int) Math.log10(num) + 1;
        System.out.println("The number of digits is " + digits);
    }
}
