package L8Q2;

import java.util.Scanner;

public class BankAccount {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private String ic;
    private double balance;

    public BankAccount(){
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter IC: ");
        ic = sc.nextLine();
        System.out.println("Enter balance: ");
        balance = sc.nextDouble();
    }

    public void deposit() {
        System.out.println("Enter amount to deposit: ");
        double deposit = sc.nextDouble();
        balance += deposit;
        System.out.printf("Deposit RM%.2f successful.\n", deposit);
    }

    public void withdraw() {
        do {
            System.out.println("Enter amount to withdraw: ");
            double withdraw = sc.nextDouble();
            if (withdraw > balance) {
                System.out.println("Insufficient balance.");
            } else {
                balance -= withdraw;
                System.out.printf("Withdraw RM%.2f successful.\n", withdraw);
                break;
            }
        } while (true);
    }

    public void display() {
        System.out.printf("Name: %s\nIC: %s\nBalance: RM%.2f\n", name, ic, balance);
    }
}

class l8q2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        String input;
        do {
            ba.display();
            System.out.println("Enter D to deposit, W to withdraw, B to display balance, or Q to quit: ");
            input = sc.nextLine();
            switch (input) {
                case "D":
                    ba.deposit();
                    break;
                case "W":
                    ba.withdraw();
                    break;
                case "B":
                    break;
                case "Q":
                    System.out.println("Thank you for using our service.");
                    System.exit(0);
                default:
                    System.out.println("Invalid input.");
            }
        } while (true);
    }
}
