package L8Q6;

import java.util.Scanner;

public class Burger {
    static Scanner sc = new Scanner(System.in);
    private String id;
    private int qty;
    private static int total;

    public Burger(){
        System.out.print("Enter burger ID: ");
        this.id = sc.nextLine();
        this.qty = 0;
    }

    public void order(){
        System.out.print("Enter sold quantity for stall " + this.id + ": ");
        this.qty += sc.nextInt();
        total += this.qty;
    }

    public int getQty(){
        return this.qty;
    }

    public String getId(){
        return this.id;
    }

    public static int getTotal(){
        return total;
    }
}

class l8q6 {
    public static void main(String[] args) {
        Burger b1 = new Burger();
        Burger b2 = new Burger();
        Burger b3 = new Burger();
        b1.order();
        b2.order();
        b3.order();
        System.out.println("-----------------------------------------------");
        System.out.println("Burger sold for stall " + b1.getId() + ": " + b1.getQty());
        System.out.println("Burger sold for stall " + b2.getId() + ": " + b2.getQty());
        System.out.println("Burger sold for stall " + b3.getId() + ": " + b3.getQty());
        System.out.println("Total sold quantity: " + Burger.getTotal());
    }
}
