package L7Q1;

import java.io.*;
import java.util.Scanner;

public class l7q1 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(".\\out\\lab7\\coursename.dat"));
            String[] ccode = {"WXES1116", "WXES1115", "WXES1110", "WXES1112"};
            String[] cname = {"Programming I", "Data Structure", "Operating System", "Computing Mathematics I"};
            for (int i = 0; i < ccode.length; i++) {
                oos.writeUTF(ccode[i]);
                oos.writeChar(':');
                oos.writeUTF(cname[i]);
                oos.writeChar(',');
            }
            oos.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(".\\out\\lab7\\coursename.dat"));
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a course code: ");
            String courseCode = sc.next();
            while (true) {
                String stuff = ois.readUTF();
                ois.readChar();

                if (stuff.equalsIgnoreCase(courseCode)) {
                    System.out.println(ois.readUTF());
                    ois.close();
                }
            }
        } catch (EOFException e) {

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}


