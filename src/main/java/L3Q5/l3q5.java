package L3Q5;

import java.util.Scanner;

public class l3q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e,f;
        double x,y;
        System.out.println("Enter a,b,c,d,e,f separated by space: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();

        if (a*d - b*c == 0) {
            System.out.println("The equation has no solution.");
        } else {
            x = (double)(e * d - b * f) / (a * d - b * c);
            y = (double)(a * f - e * c) / (a * d - b * c);
            System.out.printf("x = %.3f, y = %.3f", x, y);
        }
    }
}
