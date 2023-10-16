//FUCKED UP DONT USE THIS QUESTION

package pastyear;

import java.util.Scanner;
import java.util.ArrayList;

public class Genome {
    static Scanner sc = new Scanner(System.in);

    public static String getInput() {
        System.out.println("Enter genome string [quit to stop] :");
        String gen = sc.nextLine();
        if (gen.equals("quit")) System.exit(0);
        else return gen;
        return gen;
    }

    public static String cutString(String gen) {
        String boleh = "";
        if (gen.contains("ATG")) {
            boleh = gen.substring(gen.indexOf("ATG") + 3);
        }
        return boleh;
    }

    public static ArrayList<String> cutString(ArrayList<String> cGen) {
        cGen.subList(cGen.indexOf("ATG"), cGen.size() - 1).clear();
        return cGen;
    }

    public static ArrayList<String> getConfirm(ArrayList<String> listGen) {
        ArrayList<String> confirmGen = new ArrayList<>();
        if (listGen.contains("TAG")) {
            listGen.subList(listGen.indexOf("TAG"), listGen.size()).clear();
            confirmGen.addAll(listGen);
        } else if (listGen.contains("TAA")) {
            listGen.subList(listGen.indexOf("TAA"), listGen.size()).clear();
            confirmGen.addAll(listGen);
        } else if (listGen.contains("TGA")) {
            listGen.subList(listGen.indexOf("TGA"), listGen.size()).clear();
            System.out.println(listGen);
            confirmGen.addAll(listGen);
        }
        return confirmGen;
    }

    public static ArrayList<String> mulOf3(String gen) {
        ArrayList<String> splitted = new ArrayList<>();
        int i = gen.length();
        int j = 0, endj = 3;
        while (i > 0) {
            if (endj > gen.length()) endj = gen.length();
            splitted.add(gen.substring(j, j+3));
            j+=3;
            endj+=3;
            i-=3;
        }
        return splitted;
    }

    public static void main(String[] args) {
        while (true) {
            String gen = getInput();
            while (gen.length() > 0) {
                String newgen = cutString(gen);
                if (newgen.equals("")) {
                    System.out.println("No gene is found - newgen");
                    break;
                } else {
                    ArrayList<String> listGen = mulOf3(newgen);
                    ArrayList<String> genes = getConfirm(listGen);
                    if (genes.size() == 0) {
                        System.out.println("No gene is found - genes");
                        break;
                    } else {
                        if (genes.contains("ATG")) {
                            genes = cutString(genes);
                        } else {
                            String letsgo = String.join("", genes);
                            System.out.println(letsgo);
                            break;
                        }
                    } // end else
                }
            } //end while
        }
    }
}