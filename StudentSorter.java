import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.String;
/**
 * Write a description of class StudentSorter here.
 * 
 * @author Juan Carlos Ponce
 * @version May 3, 2013
 */
public class StudentSorter
{
    public static void main(String [] args){

        
        File file = new File("Student100.txt");
        Student temp;
        Student [] database = new Student[200]; // extra space in case we go over 100
        int num = 0;
        try{
            Scanner s = new Scanner(file);
                                    
            while (s.hasNext())
            {
                 // read in a Student record from the scanner and store in database array
                String str = s.nextLine();
                //I need to parse str

                String [] splits = str.split(" ");

                int id = Integer.parseInt(splits[0]);
                String last = splits[1];
                String first = splits[2];
                double gpa =  Double.parseDouble(splits[3]);


                database[num++] = new Student(first, last, id, gpa);
            }
        } 
        catch (FileNotFoundException e) { 
            e.printStackTrace(); 
        }   
        
 
        // print the unsorted database array
        System.out.println();
        
        
        // sort and display the database array by lastName 
        //   (and if two or more last names are the same, 
        //    they should then be arranged by firstName)
        //   use the Java Arrays.sort method
        
        // Then sort and display the database array by ID 
        
        // Then sort and display the database array by descending GPA 
        
        
        
        
      
    }

}


