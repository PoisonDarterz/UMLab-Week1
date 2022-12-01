package L6Q6;

public class l6q6 {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPali(int n) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return n == rev;
    }

    static int paliPrime(int n){
        int count = 0;
        int i = 2;
        while (count < n){
            if (isPrime(i) && isPali(i)){
                count++;
            }
            i++;
        }
        return i-1;
    }

    static int emirp(int n){
        int count = 0;
        int i = 2;
        int rev = 0;
        while (count < n){
            if (isPrime(i) && !isPali(i)){
                int temp = i;
                rev = 0;
                while (temp != 0) {
                    rev = rev * 10 + temp % 10;
                    temp /= 10;
                }
                if (isPrime(rev)){
                    count++;
                }
            }
            i++;
        }
        return i-1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            System.out.printf("%-5d", paliPrime(i+1));
            System.out.printf("%-5d", emirp(i+1));
            System.out.println();
        }
    }

}
