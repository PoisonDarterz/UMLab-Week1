package L4Q4;

import java.util.Scanner;

public class l4q4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int year, input = 0;
        int day;

        System.out.print("Enter the year: ");
        year = s.nextInt();

        System.out.print("Enter the first day of year(0 for Sunday, 1 for Monday....6 for Saturday): ");
        day = s.nextInt();

        System.out.println();

        input = 5;
        print_cal(input, year, day);
        input = 8;
        print_cal(input, year, day);
    }

    public static void print_cal(int input, int year, int day){
        int month, empty_space, initial_days = 0, initial_space = day;
        int[] month_space = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (year % 4 == 0){
            month_space[1] = 29;
        }

        month = input - 1;

//        total no. of days in the months skipped
        for (int i = 0; i < month; i++){
            initial_days += month_space[i];
        }

//        no. of empty space at the start of each month
        empty_space = (initial_space + initial_days) % 7;

//        prints calendar header
        System.out.print("      ");

        switch(input){
            case 5 -> System.out.print("May");
            case 8 -> System.out.print("Aug");
        }

        System.out.print(" " + year);
        System.out.println();
        System.out.println("S  M  T  W  T  F  S");

//        prints empty space
        for (int i = 1 ; i <= empty_space ; i++){
            System.out.print("   ");
        }

//        prints following dates
        for (int i = 1 ; i <= month_space[input - 1] ; i++){
            System.out.printf("%-3d", i);

            if((i + empty_space) % 7 == 0){
                System.out.println();
            }
        }

        System.out.println("\n");
    }
}
