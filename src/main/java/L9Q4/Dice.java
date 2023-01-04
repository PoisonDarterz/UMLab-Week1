package L9Q4;

import java.util.Random;

public class Dice {
    static Random rng = new Random();
    protected String name;

    public Dice(String name){
        this.name = name;
    }

    public int rollDice(){
        return rng.nextInt(6) + 1;
    }
}

class GameOne extends Dice {
    private int dice1, dice2, dice3;
    private int sum = 0;

    public GameOne(String name){
        super(name);
    }

    public void roll(){
        do {
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println(this.name + ": " + dice1 + " " + dice2);
            sum += dice1 + dice2;
            if (dice1 == dice2) {
                dice3 = rollDice();
                System.out.println(this.name + ": " + dice3);
                sum += dice3;
            } else {
                break;
            }
        } while (true);
    }

    public int getSum(){
        return this.sum;
    }
}

class GameTwo extends Dice {
    private int dice1, dice2;
    private int sum = 0;

    public GameTwo(String name){
        super(name);
    }

    public void roll(){
        int count = 0;
        dice1 = rollDice();
        System.out.println(this.name + ": " + dice1);
        if (dice1 == 6) {
            dice2 = rollDice();
            System.out.println(this.name + ": " + dice2);
            if (dice1 == dice2){
                System.out.println("No score due to two 6s");
            } else {
                count = 2;
                sum += dice1 + dice2;
            }
        } else {
            count = 1;
            sum += dice1;
        }

        if (this.sum > 100){
            if(count == 1) {
                System.out.println("No score due to sum > 100");
                sum -= dice1;
            } else {
                System.out.println("No score due to sum > 100");
                sum -= (dice1 + dice2);
            }
        }
    }

    public int getSum(){
        return this.sum;
    }
}

class l9q4 {
    public static void main(String[] args) {
        playgame1("P1", "P2");
        playgame2("P3", "P4");
    }

    public static void playgame1(String name1, String name2){
        GameOne g1 = new GameOne(name1);
        GameOne g2 = new GameOne(name2);
        do {
            g1.roll();
            g2.roll();
        } while (g1.getSum() < 100 && g2.getSum() < 100);
        System.out.println();
        System.out.println(g1.getSum() > g2.getSum() ? g1.name + " wins!" : g2.name + " wins!");
        System.out.println("Score: " + g1.name + " " + g1.getSum() + " " + g2.name + " " + g2.getSum() + "\n");
    }

    public static void playgame2(String name1, String name2){
        GameTwo g1 = new GameTwo(name1);
        GameTwo g2 = new GameTwo(name2);
        do {
            g1.roll();
            g2.roll();
        } while (g1.getSum() != 100 && g2.getSum() != 100);
        System.out.println();
        System.out.println(g1.getSum() == 100 ? g1.name + " wins!" : g2.name + " wins!");
        System.out.println("Score: " + g1.name + " " + g1.getSum() + " " + g2.name + " " + g2.getSum() + "\n");
    }
}
