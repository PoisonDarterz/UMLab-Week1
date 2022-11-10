package ProbSolving;

import java.util.Scanner;
import java.util.Random;

public class Q1_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        System.out.print("Enter the number of staff: ");
        int staff = sc.nextInt();
        int id, idtemp;
        boolean a, b, x;
        for (int i = 0 ; i < staff ; i++){
            id = rng.nextInt(100000) + 10000;
            System.out.printf("Staff ID: %d", id);
            idtemp = id;
            idtemp/=10;
            a = idtemp % 2 == 0;
            idtemp/=100;
            b = idtemp % 2 == 1;
            x = a && b;
            if (x){
                System.out.println("\nWeekend Duty");
            } else {
                System.out.println("\nWeekend Off");
            }
        }
    }
}
