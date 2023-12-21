package L7Q5;

import java.io.*;
import java.util.Scanner;

public class l7q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(".\\out\\lab7\\person.dat"));
            int total = ois.readInt();
            String[] name = new String[total];
            int[] age = new int[total];
            char[] gender = new char[total];

            for(int i = 0; i < total; i++) {
                name[i] = ois.readUTF();
                age[i] = ois.readInt();
                gender[i] = ois.readChar();
            }

            for(int i = 0; i < total - 1; i++) {
                for(int j = 0 ; j < total - 1 - i; j++) {
                    if(name[j].compareToIgnoreCase(name[j+1])>0) {
                        String temp = name[j];
                        name[j] = name[j+1];
                        name[j+1] = temp;

                        int temp1 = age[j];
                        age[j] = age[j+1];
                        age[j+1] = temp1;

                        char temp2 = gender[j];
                        gender[j] = gender[j+1];
                        gender[j+1] = temp2;
                    }
                }
            }

            for (int j = 0; j < total; j++){
                System.out.println("Name: " + name[j]);
                System.out.println("Age: " + age[j]);
                System.out.println("Gender: " + gender[j]);
                System.out.println();
            }

            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
