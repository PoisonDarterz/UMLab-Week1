package L4Q7;

import java.util.Scanner;

public class l4q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter interest rate in %: ");
        double interest = sc.nextDouble();
        System.out.print("Enter number of months: ");
        int months = sc.nextInt();
        double m = (principal * (interest / 1200)) / (1 - Math.pow(1 + (interest / 1200), -months));
        System.out.printf("%-10s%-20s%-15s%-15s%-20s%-20s\n", "Month", "Monthly Payment", "Principal", "Interest", "Balance", "Total Interest");
        double balance = principal;
        double totalinterest = 0;

        for (int i = 1; i <= months; i++){
            double interestpaid = balance * (interest / 1200);
            double principalpaid = m - interestpaid;
            balance -= principalpaid;
            totalinterest += interestpaid;
            System.out.printf("%-10d%-20.2f%-15.2f%-15.2f%-20.2f%-20.2f\n", i, m, principalpaid, interestpaid, balance, totalinterest);
        }
    }
}
