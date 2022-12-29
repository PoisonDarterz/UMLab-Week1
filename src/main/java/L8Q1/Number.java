package L8Q1;

import java.util.Random;

public class Number {
    public static Random rng = new Random();
    private int[] arr;
    int size, bound;

    //constructors
    public Number(){
        size = 10;
        bound = 101;
        arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rng.nextInt(bound);
        }
    }
    public Number(int s){
        size = s;
        bound = 101;
        arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rng.nextInt(bound);
        }
    }
    public Number(int s, int b){
        size = s;
        bound = b;
        arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rng.nextInt(bound);
        }
    }

    public void getItems(){
        System.out.print("Number(s): ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }

    public void getEven(){
        System.out.print("Even number(s): ");
        for(int i=0 ; i<arr.length ; i++){
            if(this.arr[i]%2==0)
                System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }

    public void getPrime(){
        System.out.print("Prime number(s): ");
        for(int i=0 ; i<arr.length ; i++){
            boolean prime = true;
            if(arr[i]==1 || arr[i]==0){
                prime = false;
            }

            for(int j=2 ; j<=Math.sqrt(arr[i]) ; j++){

                if(arr[i]%j==0){
                    prime = false;
                    break;
                }
            }

            if(prime){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public void getMax(){
        int max = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("Maximum number: " + max);
    }

    public void getMin(){
        int min = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("Minimum number: " + min);
    }

    public void getAverage(){
        int sum=0;
        for(int i=0 ; i<arr.length ; i++){
            sum+=arr[i];
        }

        System.out.println("Average: " + sum/arr.length);
    }

    public void getSquare(){
        System.out.print("Square number(s): ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]*arr[i] + " ");
        }
        System.out.println();
    }
}

class l8q1 {
    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4, 50);

        a.getItems();
        a.getEven();
        a.getPrime();
        a.getMax();
        a.getMin();
        a.getAverage();
        a.getSquare();
        System.out.println();
        b.getItems();
        b.getEven();
        b.getPrime();
        b.getMax();
        b.getMin();
        b.getAverage();
        b.getSquare();
        System.out.println();
        c.getItems();
        c.getEven();
        c.getPrime();
        c.getMax();
        c.getMin();
        c.getAverage();
        c.getSquare();
    }
}
