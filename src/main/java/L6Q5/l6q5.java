package L6Q5;

import java.util.Scanner;
import java.util.Random;

public class l6q5 {
    static boolean checkAns(int a, int b, int c){
        return a*b == c;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        int correct = 0;
        do {
            int a = rng.nextInt(13);
            int b = rng.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.printf("%d x %d = ", a, b);
            int ans = sc.nextInt();
            if (ans < 0) break;
            if (checkAns(a, b, ans)) {
                correct++;
            }
        } while (true);
        System.out.printf("You got %d correct.", correct);
    }
}
