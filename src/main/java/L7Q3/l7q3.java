package L7Q3;

import java.io.*;
import java.util.Scanner;

public class l7q3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream(".\\out\\lab7\\random.txt"));
            PrintWriter pw = new PrintWriter(new FileOutputStream(".\\out\\lab7\\reverse.txt"));
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                for (int i = str.length() - 1; i >= 0; i--) {
                    pw.print(str.charAt(i));
                }
                pw.println();
            }
            sc.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
