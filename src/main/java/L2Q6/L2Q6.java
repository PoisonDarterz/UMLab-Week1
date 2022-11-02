package L2Q6;

import java.util.Scanner;

class L2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in grams: ");
        double M = sc.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double FI = sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double FF = sc.nextDouble();
        double I = (FI - 32) * 5 / 9;
        double F = (FF - 32) * 5 / 9;
        double Q = M/1000 * (F - I) * 4184;
        System.out.printf("The energy needed is %.1f", Q);
    }
}
