import java.util.Scanner;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: Juan Carlos Ponce
 * Date: 5/6/13
 * Time: 3:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class mnemonics {

    Scanner keyboard = new Scanner(System.in);
    String number = "123";

    public static String digitLetters(char ch){
        if(ch == '1')
            return "";
        else if(ch == '2')
            return "ABC";
        else if(ch == '3')
            return "DEF";
        else if(ch == '4')
            return  "GHI";
        else if(ch == '5')
            return "JKL";
        else if(ch == '6')
            return "MNO";
        else if(ch == '7')
            return "PRS";
        else if(ch == '8')
            return "TUV";
        else
            return "WXY";
    }

    public static void recursiveMnemonics(Vector<String> result,
                            String mnemonicSoFar, // the mnemonic being built up
                            String digitsLeft) // the remaining digits
    {
        if(digitsLeft.isEmpty()) {
            System.out.println(mnemonicSoFar);

            //result.add(mnemonicSoFar);

        }
        else{
            String str = digitLetters( digitsLeft.charAt(0));
            recursiveMnemonics(result, mnemonicSoFar + str.charAt(0), digitsLeft.substring(1,digitsLeft.length()));
            recursiveMnemonics(result, mnemonicSoFar + str.charAt(1), digitsLeft.substring(1,digitsLeft.length()));
            recursiveMnemonics(result, mnemonicSoFar + str.charAt(2), digitsLeft.substring(1,digitsLeft.length()));
        }
    }



    public static void main(String [] args)
    {
             System.out.println("-------------  Hello World  --------------");

             System.out.println("The O(n) is 3^n because there is 3 options for each position(Typically). Hence the 3^3 values in this exercise");

           listmnemonics("723");

    }

    public static Vector<String> listmnemonics(String phoneNumber)
    {
        Vector<String> result = null;
        recursiveMnemonics(result, "", phoneNumber);
        // when starting the mnemonicSoFar is the empty string
        return result;
    }

}








