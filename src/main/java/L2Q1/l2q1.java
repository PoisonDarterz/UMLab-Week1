package L2Q1;

import java.util.Scanner;


class l2q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 1.8;
        System.out.printf("Temperature in Celsius: %.2f", celsius);
    }
}
