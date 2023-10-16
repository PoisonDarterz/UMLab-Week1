package pastyear;

import java.util.Scanner;
import java.util.Random;

public class Mat2x2 {
    static Scanner sc = new Scanner(System.in);
    static Random rng = new Random();

    public static int[][] genMat(int n) {
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = rng.nextInt(10);
            }
        }
        return mat;
    }

    public static void dispMat(int[][] mat, int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMat(int[][] mat1, int[][] mat2, int n){
        int[][] added = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                added[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return added;
    }

    public static int[][] mulMat(int[][] mat1, int[][] mat2, int n){
        int[][] multi = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    multi[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return multi;
    }

    public static void main(String[] args) {
        System.out.println("Enter N: ");
        int n = sc.nextInt();

        int[][] matA = genMat(n);
        int[][] matB = genMat(n);

        System.out.println("Matrix A");
        dispMat(matA, n);
        System.out.println("Matrix B");
        dispMat(matB, n);

        int[][] added = addMat(matA, matB, n);
        int[][] multi = mulMat(matA, matB, n);

        System.out.println("Matrix A + B");
        dispMat(added, n);
        System.out.println("Matrix A x B");
        dispMat(multi, n);
    }
}
