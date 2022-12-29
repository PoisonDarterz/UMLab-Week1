package L8Q3;

import java.util.Scanner;

public class WeightCalculator {
    static Scanner sc = new Scanner(System.in);
    private int age;
    private double height;
    private double weight;

    public WeightCalculator() {
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
        weight = (height - 100) + (age / 10.0) * 0.9;
    }

    public void display() {
        System.out.printf("Age: %d years old\n", age);
        System.out.printf("Height: %.1fcm\n", height);
        System.out.printf("Ideal weight: %.2fkg", weight);
    }
}

class l8q3 {
    public static void main(String[] args) {
        WeightCalculator wc = new WeightCalculator();
        wc.display();
    }
}