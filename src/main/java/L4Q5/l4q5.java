package L4Q5;

import java.util.Random;

public class l4q5 {
    public static void main(String[] args) {
        Random rng = new Random();
        int sum1 = 0, sum2 = 0;

        do {
            int dice1 = rng.nextInt(6) + 1;
            while (dice1 == 6){
                System.out.println("Player 1: " + dice1);
                sum1 += 6;
                dice1 = rng.nextInt(6) + 1;
            }
            System.out.println("Player 1: " + dice1);
            sum1 += dice1;

            int dice2 = rng.nextInt(6) + 1;
            while (dice2 == 6){
                System.out.println("Player 2: " + dice2);
                sum2 += 6;
                dice2 = rng.nextInt(6) + 1;
            }
            System.out.println("Player 2: " + dice2);
            sum2 += dice2;
            System.out.println();
        } while (sum1 < 100 && sum2 < 100);

        System.out.println("Player 1: " + sum1);
        System.out.println("Player 2: " + sum2);
        if (sum1 > sum2){
            System.out.println("Player 1 wins!");
        } else if (sum2 > sum1){
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
