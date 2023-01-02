package L8Q7;

import java.util.Scanner;

public class Money {
    private int amount;
    private int rm100;
    private int rm50;
    private int rm10;
    private int rm5;
    private int rm1;
    private int sen50;
    private int sen20;
    private int sen10;
    private int sen5;

    public Money(double amt){
        this.amount = (int)(amt*100);
    }

    public void add(double amt){
        this.amount += (int)(amt*100);
    }

    public void subt(double amt){
        this.amount -= (int)(amt*100);
    }

    public void round(){
        switch (this.amount%10){
            case 1 -> this.amount -= 1;
            case 2 -> this.amount -= 2;
            case 3 -> this.amount += 2;
            case 4 -> this.amount += 1;
            case 6 -> this.amount -= 1;
            case 7 -> this.amount -= 2;
            case 8 -> this.amount += 2;
            case 9 -> this.amount += 1;
        }
        System.out.printf("Rounded amount: %.2f\n", this.amount/100.0);
    }

    public void calc(){
        int calcAmt = this.amount;
        this.rm100 = calcAmt /10000;
        calcAmt %= 10000;
        this.rm50 = calcAmt /5000;
        calcAmt %= 5000;
        this.rm10 = calcAmt /1000;
        calcAmt %= 1000;
        this.rm5 = calcAmt /500;
        calcAmt %= 500;
        this.rm1 = calcAmt /100;
        calcAmt %= 100;
        this.sen50 = calcAmt /50;
        calcAmt %= 50;
        this.sen20 = calcAmt /20;
        calcAmt %= 20;
        this.sen10 = calcAmt /10;
        calcAmt %= 10;
        this.sen5 = calcAmt /5;
    }

    public void display(){
        System.out.println("--------------------------------");
        System.out.println("RM100:\t" + this.rm100);
        System.out.println("RM50:\t" + this.rm50);
        System.out.println("RM10:\t" + this.rm10);
        System.out.println("RM5:\t" + this.rm5);
        System.out.println("RM1:\t" + this.rm1);
        System.out.println("50 sen:\t" + this.sen50);
        System.out.println("20 sen:\t" + this.sen20);
        System.out.println("10 sen:\t" + this.sen10);
        System.out.println("5 sen:\t" + this.sen5);
    }

    public int getAmt(){
        return this.amount;
    }
}

class l8q7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        Money m = new Money(amt);
        do {
            System.out.printf("Amount: %.2f\n", (m.getAmt()/100.0));
            System.out.print("Enter 1 to add to amount, 2 to subtract from amount, 3 to calculate final, 4 to end program: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.print("Enter amount to add: ");
                    double add = sc.nextDouble();
                    m.add(add);
                }
                case 2 -> {
                    System.out.print("Enter amount to subtract: ");
                    double subt = sc.nextDouble();
                    m.subt(subt);
                }
                case 3 -> {
                    m.round();
                    m.calc();
                    m.display();
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        } while(true);
    }
}
