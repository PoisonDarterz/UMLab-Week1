package L6Q4;

public class l6q4 {
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }

    public static void main(String[] args) {
        System.out.println(gcd(24,8));
        System.out.println(gcd(200,625));
    }
}
