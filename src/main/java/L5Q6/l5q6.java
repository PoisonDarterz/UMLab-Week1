package L5Q6;

import java.util.Scanner;

public class l5q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of Pascal Triangle: ");
        int n = sc.nextInt();
        int[][] pascal = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    pascal[i][j] = 1;
                }else{
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
