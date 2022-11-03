// Class name: Converter
// Description: This is a simple program to convert from mile to meter
import java.util.Scanner;
//import java.util.*; // this will works, import wildcard

public class Converter {

  // the program start here
  public static void main (String [] args) {

    // declare and initiate 2 variables
    float mile;   // to keep the input as mile
    float meter;  // to keep the result of the converstion
    
    /* declare a variable call reader,
     to read input from keyboard
    */
    Scanner reader = new Scanner(System.in);

    // read in the mile as the input
    mile = reader.nextFloat();

    // perform the convertion
    meter = mile * 1609;

    // show the result on the screen
    System.out.println(meter);

    // the end of the program
  }
}
