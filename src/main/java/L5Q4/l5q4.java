package L5Q4;

import java.util.Random;

public class l5q4 {
    public static void main(String[] args) {
        Random rng = new Random();
        int[][] arr = new int[3][3];
        System.out.println("Original array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = rng.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // rotate matrix 90 degrees clockwise
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = arr[2-j][i];
            }
        }
        System.out.println("After rotation:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
