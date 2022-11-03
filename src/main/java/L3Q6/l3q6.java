package L3Q6;

import java.util.Scanner;
import java.lang.Math;

public class l3q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter x,y coordinates of a point by entering 2 numbers separated by space: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (distance <= radius) {
            System.out.printf("Point (%.2f, %.2f) is inside the circle.", x, y);
        } else {
            System.out.printf("Point (%.2f, %.2f) is outside the circle.", x, y);
        }
    }
}
