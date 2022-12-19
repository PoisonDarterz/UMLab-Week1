package L7Q4;

import java.io.*;
import java.util.Scanner;

public class l7q4 {
    public static void main(String[] args) {
        int charcount = 0, wordcount = 0, linecount = 0;
        try {
            Scanner sc = new Scanner(new FileInputStream("C:\\Users\\jcchu\\OneDrive - Universiti Malaya\\UM2022-23\\code\\WIX1002_JC\\out\\lab7\\lecturer.txt"));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                linecount++;
                charcount += line.length();
                wordcount += line.split(" ").length;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Number of characters: " + charcount);
        System.out.println("Number of words: " + wordcount);
        System.out.println("Number of lines: " + linecount);
    }
}
