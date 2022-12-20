package L7Q6;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class l7q6 {
    public static void main(String[] args) {
        try {
            Scanner prod = new Scanner(new FileInputStream("C:\\Users\\jcchu\\OneDrive - Universiti Malaya\\UM2022-23\\code\\WIX1002_JC\\out\\lab7\\product.txt"));
            Scanner ord = new Scanner(new FileInputStream("C:\\Users\\jcchu\\OneDrive - Universiti Malaya\\UM2022-23\\code\\WIX1002_JC\\out\\lab7\\order.txt"));
            ArrayList<String> prodID = new ArrayList<String>();
            ArrayList<String> prodName = new ArrayList<String>();
            ArrayList<Double> prodPrice = new ArrayList<Double>();
            ArrayList<String> ordID = new ArrayList<String>();
            ArrayList<String> ordProdID = new ArrayList<String>();
            ArrayList<Integer> ordQty = new ArrayList<Integer>();
            int ordcount = 0, prodcount = 0;

            while (prod.hasNextLine()){
                String line = prod.nextLine();
                String[] prodArr = line.split(",");
                prodID.add(prodArr[0]);
                prodName.add(prodArr[1]);
                prodPrice.add(Double.parseDouble(prodArr[2]));
                prodcount++;
            }
            while (ord.hasNextLine()){
                String line = ord.nextLine();
                String[] ordArr = line.split(",");
                ordID.add(ordArr[0]);
                ordProdID.add(ordArr[1]);
                ordQty.add(Integer.parseInt(ordArr[2]));
                ordcount++;
            }
            ArrayList<Double> ordTotal = new ArrayList<Double>();
            ArrayList<String> ordName = new ArrayList<String>();
            ArrayList<Double> ordUnit = new ArrayList<Double>();

            for(int i = 0; i < ordcount; i++){
                for (int j = 0; j < prodcount; j++){
                    if (ordProdID.get(i).equals(prodID.get(j))){
                        double total = prodPrice.get(j) * ordQty.get(i);
                        ordTotal.add(total);
                        ordName.add(prodName.get(j));
                        ordUnit.add(prodPrice.get(j));
                    }
                }
            }
            
            System.out.printf("%-10s %-20s %-5s %-10s %-10s\n", "ProductID", "Product Name", "Qty", "Unit Price", "Total Price");
            for (int i = 0; i < ordcount; i++){
                System.out.printf("%-10s %-20s %-5d %-10.2f %-10.2f\n", ordProdID.get(i), ordName.get(i), ordQty.get(i), ordUnit.get(i), ordTotal.get(i));
            }
            prod.close();
            ord.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
