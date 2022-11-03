package L3Q2;

import java.util.Random;

class l3q2 {
    public static void main(String[] args) {
        Random rng = new Random();
        int num = rng.nextInt(5);

        if (num == 0) {
            System.out.printf("%d is zero.", num);
        } else if (num == 1) {
            System.out.printf("%d is one.", num);
        } else if (num == 2) {
            System.out.printf("%d is two.", num);
        } else if (num == 3) {
            System.out.printf("%d is three.", num);
        } else if (num == 4) {
            System.out.printf("%d is four.", num);
        } else if (num == 5) {
            System.out.printf("%d is five.", num);
        }
    }
}
