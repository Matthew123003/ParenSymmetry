package src.main.java;

import java.io.*;
import java.util.Scanner;

public class ParenSymmetry {


    private Boolean isBalanced(String s) {
        return true;
    }
        // implement this method



    private void checkFile(String filename) {
        // open file named filename
          try {
              BufferedReader reader = new BufferedReader(new FileReader("filename"));
              String line;
              while ((line = reader.readLine()) != null ){
                  System.out.println(reader.readLine());}
                  reader.close();
              } catch (IOException e){
               e.printStackTrace();
              }


        // for each line in the file
            // read the line
            // print whether or not the line's parenthesis are balanced

        // CLOSE the file
    }

    public static void main(String[] args) {
        ParenSymmetry ps = new ParenSymmetry();

        Boolean b0 = ps.isBalanced("()");
        printResult(b0, true);

        String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};
        Boolean falses = true;
        for (String strToTest : falseStrings) {
            falses = ps.isBalanced(strToTest);
        }
        printResult(falses, false);

        String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
        Boolean trues = false;
        for (String strToTest : trueStrings) {
            trues = ps.isBalanced(strToTest);
        }
        printResult(trues, true);

    }

    private static void printResult(Boolean b0, boolean b) {
        if (b0 == null) {
            System.out.println("Null Failure");
            return;
        }
        if (b0 == b) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}
