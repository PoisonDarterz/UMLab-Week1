package pastyear;

import java.io.*;
import java.util.Scanner;

public class EvenCount {
    public static void main(String[] args){
        int count[] = {0,0,0,0,0};
        try {
            Scanner in = new Scanner(new FileInputStream(".\\out\\lab7\\raw.txt"));
            while(in.hasNextLine()){
                int num = in.nextInt();
                switch(num){
                    case 2 -> count[0]++;
                    case 4 -> count[1]++;
                    case 6 -> count[2]++;
                    case 8 -> count[3]++;
                    case 10 -> count[4]++;
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        int max = -9, maxindex = -1, mode = 0;
        for (int i = 0; i < 5 ; i++){
            if (count[i] > max){
                max = count[i];
                maxindex = i;
            }
        }
        System.out.println("Frequency Distribution Table");
        System.out.println("2 : " + count[0]);
        System.out.println("4 : " + count[1]);
        System.out.println("6 : " + count[2]);
        System.out.println("8 : " + count[3]);
        System.out.println("10 : " + count[4]);
        switch (maxindex) {
            case 0 -> mode = 2;
            case 1 -> mode = 4;
            case 2 -> mode = 6;
            case 3 -> mode = 8;
            case 4 -> mode = 10;
        }
        System.out.println("The mode of the dataset is : " + mode);
    }
}
