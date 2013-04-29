import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class StudentSorter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentSorter
{
    public static void main(String [] args){
        
        File file = new File("Student100.txt");
        Student temp;
        Student [] database = new Student[200]; // extra space in case we go over 100
        try{
            Scanner s = new Scanner(file);
                                    
            while (s.hasNext())
            {
                 // read in a Student record from the scanner and store in database array

            }
        } 
        catch (FileNotFoundException e) { 
            e.printStackTrace(); 
        }   
        
 
        // print the unsorted database array
        
        
        // sort and display the database array by lastName 
        //   (and if two or more last names are the same, 
        //    they should then be arranged by firstName)
        //   use the Java Arrays.sort method
        
        // Then sort and display the database array by ID 
        
        // Then sort and display the database array by descending GPA 
        
        
        
        
      
    }
}


