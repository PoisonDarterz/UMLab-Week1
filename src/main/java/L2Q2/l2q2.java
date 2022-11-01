package L2Q2;

import java.util.Scanner;

class l2q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P, D, R, Y, M;
        System.out.print("Enter price of car: ");
        P = sc.nextDouble();
        System.out.print("Enter down payment: ");
        D = sc.nextDouble();
        System.out.print("Enter interest rate in %: ");
        R = sc.nextDouble();
        System.out.print("Enter number of years: ");
        Y = sc.nextDouble();
        M = (P - D) * (1 + R * Y / 100) / (Y * 12);
        System.out.printf("Monthly installment: %.2f", M);
    }
}
