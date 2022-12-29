package LabTest;

import java.util.Scanner;

// Jonas Chuan
public class labtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array inits
        String[] regno = {"s12345", "s24567", "s23789", "s14569", "s18743"};
        String[] name = {"Ali", "Beng", "Carmen", "Dinesh", "Emilia"};
        double[] marks = {77.9, 33.1, 90.3, 60.5, 40.7};
        double sum = 0, average;

        //calc average
        for (double i : marks){
            sum += i;
        }
        average = sum / marks.length;

        //print original data and average
        System.out.println("Original Data: ");
        System.out.printf("%-10s %-10s %-10s\n", "Reg No", "Name", "FOP Marks");
        System.out.println("+---------------------------------+");
        for (int i = 0; i < marks.length; i++){
            System.out.printf("%-10s %-10s %-10.1f\n", regno[i], name[i], marks[i]);
        }
        System.out.printf("\nAverage marks is:\t%.2f\n", average);

        //sort and print sorted data, with insight on whether student is above or below average
        System.out.println("\nSorted Data (by Marks):");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Reg No", "Name", "FOP Marks", "Average");
        System.out.println("+-----------------------------------------+");

        for (int i = 0; i < marks.length; i++){
            for (int j = 0; j < marks.length - 1; j++){
                if (marks[j] < marks[j+1]){
                    double temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;

                    String temp2 = regno[j];
                    regno[j] = regno[j+1];
                    regno[j+1] = temp2;

                    String temp3 = name[j];
                    name[j] = name[j+1];
                    name[j+1] = temp3;
                }
            }
        }

        String[] status = new String[5];
        for (int i = 0; i < marks.length; i++){
            if (marks[i] > average){
                status[i] = "ABOVE";
            } else if (marks[i] < average){
                status[i] = "BELOW";
            } else {
                status[i] = "AVERAGE";
            }
            System.out.printf("%-10s %-10s %-10.1f %-10s\n", regno[i], name[i], marks[i], status[i]);
        }

    }
}
