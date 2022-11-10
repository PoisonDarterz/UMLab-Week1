package L2Q3;

import java.util.Random;

class l2q3 {
    public static void main(String[] args) {
        Random rng = new Random();
        int[] arr = new int[3];
        int sum = 0;
        double average;
        System.out.print("Random numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rng.nextInt(41) + 10;
            sum = sum + arr[i];
            System.out.print(arr[i] + " ");
        }
        average = sum / 3.0;
        System.out.printf("%nThe sum is %d", sum);
        System.out.printf("%nAverage: %.2f", average);
    }
}
