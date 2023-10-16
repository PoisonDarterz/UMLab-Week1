package pastyear;

import java.io.*;
import java.util.Scanner;

public class AnalyzeText {
    public static void main(String[] args) {
        int numWords = 0;
        int numSens = 0;
        int[] charCount = new int[26];
        try {
            Scanner in = new Scanner(new FileInputStream(".\\out\\lab7\\lmao.txt"));
            while (in.hasNextLine()) {
                String paragraph = in.nextLine();
                String[] sentences = paragraph.split("\\.");
                numSens = sentences.length;
                String[] words = paragraph.split(" ");
                numWords = words.length;
                paragraph = paragraph.toLowerCase();
                char[] paraChar = paragraph.toCharArray();
                for (char i : paraChar) {
                    if ((int) i >= 97 && (int) i <= 122) {
                        charCount[(int)i - 97]++;
                    }
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Number of sentences: " + numSens);
        System.out.println("Number of words: " + numWords);
        for (int i = 97; i <= 122; i++) {
            System.out.printf("%c : %d   ", (char) i, charCount[i - 97]);
            if (i % 6 == 0) {
                System.out.println();
            }
        }
    }
}
