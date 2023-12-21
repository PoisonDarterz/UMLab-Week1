package L4Q2;

import java.util.Scanner;

public class l4q2 {

    //1 + (1+2) + (1+2+3) + … + (1+2+3+…+n) 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int sum = 0, sumj=0;;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++){  // 1+2+3+…+n) 
                sumj+=j;
            }
            sum+=sumj;
            sumj=0;
        }
        System.out.println("The sum is: " + sum);
    }
}
