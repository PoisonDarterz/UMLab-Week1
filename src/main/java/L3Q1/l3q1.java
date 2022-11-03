package L3Q1;

import java.util.Scanner;

class l3q1 {
    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer numbers separated by a space: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        int c=0;

        if(op == '+') {
            c = plus(num1, num2);
        } else if (op == '-') {
            c = minus(num1, num2);
        } else if (op == '*') {
            c = multiply(num1, num2);
        } else if (op == '/') {
            c = divide(num1, num2);
        } else if (op == '%') {
            c = modulo(num1, num2);
        }

        System.out.printf("%d %c %d = %d", num1, op, num2, c);
    }
}
