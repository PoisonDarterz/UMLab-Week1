package L4Q8;

import java.util.Random;

public class l4q8 {
    public static void main(String[] args) {
        Random rng = new Random();
        int num = rng.nextInt(100);
        System.out.println("The random number is " + num);
        boolean isPrime;
        for(int i=2; i<=num; i++) {
            isPrime = true;
            for (int j=2; j<i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}