import java.util.Scanner;
import java.util.Stack;
import java.lang.String;

/**
 * This program solves the Billiards problem from assignment 4.
 * 
 * @author Juan Carlos Ponce
 * @version May 5, 2013
 */
public class BilliardsProblem
{
 
    public static void main(String [] args)
    {
        System.out.println("I think that billiards is between n^3 and 2^n.");

        System.out.println("What string should I place with Dashes? ...");
        Scanner words = new Scanner(System.in);

        String word =  words.nextLine();

        rec(word);

        System.out.println("What value ball is pulled out");
        Scanner keyboard = new Scanner(System.in);

        int N = Integer.parseInt(keyboard.next());

        Stack<Integer> theStack;
        theStack = new Stack<Integer>();

        int count = 0;

        theStack.push(N);
        int num;

        while(!theStack.isEmpty())
        {
            num = theStack.pop();
            System.out.println("I removed: " + num);
            if(num != 1)
            {
                for(int i = 0; i < num; i++)   {
                     theStack.push(num/2);
                    System.out.println("I'll put in: " + num/2);
                    count++;
                }
            } else{
                count++;
            }
        }


               System.out.println("For N: " + N + " Count: " + count);
    }

    public static void rec(String phrase){
            if (phrase.length() == 1)
                System.out.println(phrase);
            else{
                System.out.print(phrase.substring(0,1) + " - ");
                rec(phrase.substring(1,phrase.length()));
            }
    }

}
