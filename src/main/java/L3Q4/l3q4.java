package L3Q4;

import java.util.Random;

class l3q4 {
    public static void main(String[] args) {
        Random rng = new Random();
        int num1, num2, sum1 = 0, sum2 = 0;
        for (int i = 0; i < 2; i++) {
            num1 = rng.nextInt(6) + 1;
            System.out.println("Random number for Player 1: " + num1);
            sum1 += num1;
        }
        for (int i = 0; i < 2; i++) {
            num2 = rng.nextInt(6) + 1;
            System.out.println("Random number for Player 2: " + num2);
            sum2 += num2;
        }

        if (sum1 > sum2) {
            System.out.println("Player 1 wins!");
        } else if (sum1 < sum2) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
