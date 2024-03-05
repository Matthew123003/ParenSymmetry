package src.main.java;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class ParenSymmetry {


    private Boolean isBalanced(String s) {
        // implement this method
        int length = s.length();
        char[] chars = s.toCharArray();
        int open = 0;
        int close = 0;

        for(int i = 0; i < chars.length; i++){

            if(chars[i] == '('){
                open++;
            }else if(chars[i] == ')'){
                close++;
            }
        }
        boolean status;
        if(open == close){
            status = true;
        }else{
            status = false;
        }

       return status;
    }


    private void checkFile(String filename) {
        // open file named filename
          File file = new File(filename);

          Scanner scanner;
          try{
              scanner = new Scanner(file);
              while(scanner.hasNextLine()){
                  String line = scanner.nextLine();
                  boolean b = isBalanced(line);
                  System.out.println(b);
              }
              scanner.close();
          }catch (FileNotFoundException e){
              System.out.println(e.getMessage());
              System.exit(1);
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
