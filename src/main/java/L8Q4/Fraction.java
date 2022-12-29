package L8Q4;

import java.util.Scanner;

public class Fraction {
    static Scanner sc = new Scanner(System.in);
    private int numerator;
    private int denominator;

    //constructor
    public Fraction(int n, int d){
        numerator = n;
        denominator = d;
    }

    //getter and setter
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setNumerator(int n) {
        numerator = n;
    }
    public void setDenominator(int d) {
        denominator = d;
    }

    //get gcd
    public int getGCD(int n, int d){
        if (d == 0) return n;
        return getGCD(d, n % d);
    }

    //display simplest fraction
    public void display(){
        int gcd = getGCD(numerator, denominator);
        System.out.printf("The simplest fraction is %d/%d", numerator/gcd, denominator/gcd);
    }

}

class l8q4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter numerator: ");
        int n = sc.nextInt();
        System.out.print("Enter denominator: ");
        int d = sc.nextInt();
        Fraction f = new Fraction(n, d);
        f.display();
    }
}
