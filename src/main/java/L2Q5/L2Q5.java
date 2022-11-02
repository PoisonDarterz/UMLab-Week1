package L2Q5;

import java.util.Random;

class L2Q5 {
    public static void main(String[] args) {
        Random rng = new Random();
        int num = rng.nextInt(10000);
        System.out.println("Random number: " + num);
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
