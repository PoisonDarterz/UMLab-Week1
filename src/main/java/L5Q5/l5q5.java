package L5Q5;

import java.util.Random;
import java.util.Scanner;

public class l5q5 {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[20];
        System.out.print("List of 20 numbers: ");
        for (int i = 0; i < 20; i++) {
            num[i] = rng.nextInt(101);
            System.out.print(num[i] + " ");
        }

        // sort in descending order
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 19; j++) {
                if (num[j] < num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.print("\nArray in descending order: ");
        for (int k : num) {
            System.out.print(k + " ");
        }


        System.out.print("\nEnter number to search: ");
        int search = sc.nextInt();

        // linear search
        for (int i = 0; i < 20; i++) {
            if (num[i] == search){
                System.out.printf("Number %d found at index %d (%d loops)", search, i, i+1);
                break;
            }
            if (i == 19){
                System.out.println("Not found");
            }
        }
        System.out.println();

        // binary search with descending array
        int low = 0, high = 19, mid = 0, count = 1;
        while (low <= high){
            mid = (low + high)/2;
            if (num[mid] == search){
                System.out.printf("Number %d found at index %d (%d loops)", search, mid, count);
                break;
            }
            else if (num[mid] > search){
                low = mid + 1;
            }
            else if (num[mid] < search){
                high = mid - 1;
            }
            count++;
            if (low > high){
                System.out.println("Not found");
            }
        }
    }
}
