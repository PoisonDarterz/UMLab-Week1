package L2Q4;

import java.util.Scanner;

class l2q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int sec = sc.nextInt();
        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", sec, hours, minutes, seconds);
    }
}
