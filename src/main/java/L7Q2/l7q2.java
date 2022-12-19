package L7Q2;

import java.io.*;
import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;

public class l7q2 {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            PrintWriter pw = new PrintWriter(new FileOutputStream("C:\\Users\\jcchu\\OneDrive - Universiti Malaya\\UM2022-23\\code\\WIX1002_JC\\out\\lab7\\index.htm"));
            while (in.hasNext()) {
                pw.println(in.nextLine());
            }
            pw.close();
            in.close();
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
