package L2Q6;

import java.util.Scanner;

class L2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in kg: ");
        double M = sc.nextDouble();
        System.out.print("Enter the initial temperature in Celsius: ");
        double I = sc.nextDouble();
        System.out.print("Enter the final temperature in Celsius: ");
        double F = sc.nextDouble();
        double Q = M * (F - I) * 4184;
        System.out.printf("The energy needed is %.1f", Q);
    }
}
