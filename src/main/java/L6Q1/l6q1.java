package L6Q1;

public class l6q1 {
    static int triNum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++){
            System.out.println(triNum(i));
        }
    }
}
