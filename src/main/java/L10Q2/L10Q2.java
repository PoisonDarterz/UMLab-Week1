/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
public class L10Q2 {
    public static void main(String[] args) {
        substitutionCipher complex = new substitutionCipher(".\\plaintext.txt",".\\outputFile.txt",10);
        System.out.println(complex.encode(".\\plaintext.txt"));
        System.out.println(complex.decode(".\\ciphertext.txt"));
    }
}

interface messageEncoder{
    public String encode(String text);
    public String decode(String cipherText);
}

class substitutionCipher implements messageEncoder{
    private String inputFileName,outputFileName;
    private int shift;
    substitutionCipher(String inputFileName , String outputFileName , int shift){
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }
    
    @Override
    public String encode(String text) {
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(this.outputFileName));
            Scanner scan = new Scanner(new FileReader(text));
            while(scan.hasNextLine()){
                String sentence = scan.nextLine();
                String newSentence = "";
                for(int i=0;i<sentence.length();i++){
                    int val = sentence.charAt(i)+this.shift;
                    newSentence+=(char)val;
                }
                pw.println(newSentence);
            }
            pw.close();
            scan.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return this.outputFileName;
    }

    @Override
    public String decode(String cipherText) {
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(this.outputFileName));
            Scanner scan = new Scanner(new FileReader(cipherText));
            while(scan.hasNextLine()){
                String sentence = scan.nextLine();
                String newSentence = "";
                for(int i=0;i<sentence.length();i++){
                    int val = sentence.charAt(i)-this.shift;
                    newSentence+=(char)val;
                }
                pw.println(newSentence);
            }
            pw.close();
            scan.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return this.outputFileName;
    }
}