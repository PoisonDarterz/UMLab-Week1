package L8Q5;

import java.util.Scanner;
import java.util.Random;

public class Game {

    static Random rng = new Random();
    private String name;
    private int sum = 0;

    public Game(String n){
        name = n;
    }

    public void play(){
        int dice = rng.nextInt(6) + 1;
        System.out.println(name + ": " + dice);
        sum += dice;
    }

    public void display(){
        System.out.println(name + ": " + sum);
    }

    public int getSum(){
        return sum;
    }

    public String getName(){
        return name;
    }
}

class l8q5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter player 1 name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter player 2 name: ");
        String name2 = sc.nextLine();
        Game g1 = new Game(name1);
        Game g2 = new Game(name2);
        while (g1.getSum() < 100 && g2.getSum() < 100){
            g1.play();
            g2.play();
            System.out.println();
        }
        g1.display();
        g2.display();
        if (g1.getSum() > g2.getSum()){
            System.out.println(g1.getName() + " wins!");
        } else if (g2.getSum() > g1.getSum()){
            System.out.println(g2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}


