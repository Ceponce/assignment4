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
        for(int i=0; i<num; i++)
            System.out.println(database[i].toString());
        
        // sort and display the database array by lastName 
        //   (and if two or more last names are the same, 
        //    they should then be arranged by firstName)
        //   use the Java Arrays.sort method

        //Sort lastName -------------------------------------------------

        System.out.println("-------- Sort by LastName -------");

        int in, out;

        for(out=1; out<num; out++){    // Out is dividing line

            Student temp2 = database[out]; // remove marked person
            in = out;

            while(in>0 &&
                    database[in-1].getLastName().compareTo(temp2.getLastName()) > 0)
            {
                database[in] = database[in-1];
                --in;
            }
            database[in] = temp2;
        }

        for(int i=0; i<num; i++)
            System.out.println(database[i].toString());


        // Then sort and display the database array by ID

        //Sort ID -------------------------------------------------

        System.out.println("-------- Sort by ID --------");


        for(out=1; out<num; out++){    // Out is dividing line

            Student temp2 = database[out]; // remove marked person
            in = out;

            while(in>0 &&
                    database[in-1].getID()-(temp2.getID()) > 0)
            {
                database[in] = database[in-1];
                --in;
            }
            database[in] = temp2;
        }

        for(int i=0; i<num; i++)
            System.out.println(database[i].toString());
        
        // Then sort and display the database array by descending GPA 

        //Sort GPA -------------------------------------------------

        System.out.println("------- Sort by GPA --------");


        for(out=1; out<num; out++){    // Out is dividing line

            Student temp2 = database[out]; // remove marked person
            in = out;

            while(in>0 &&
                    database[in-1].getGPA()-(temp2.getGPA()) > 0)
            {
                database[in] = database[in-1];
                --in;
            }
            database[in] = temp2;
        }

        for(int i=0; i<num; i++)
            System.out.println(database[i].toString());


        // just before asking user for info
        //Sort ID -------------------------------------------------

        System.out.println("-------- Sort by ID --------");


        for(out=1; out<num; out++){    // Out is dividing line

            Student temp2 = database[out]; // remove marked person
            in = out;

            while(in>0 &&
                    database[in-1].getID()-(temp2.getID()) > 0)
            {
                database[in] = database[in-1];
                --in;
            }
            database[in] = temp2;
        }

        for(int i=0; i<num; i++)
            System.out.println(database[i].toString());

        System.out.println("What student are you searching for?");
        Scanner keyboard = new Scanner(System.in);

        int searchKey = Integer.parseInt(keyboard.next());
        Student key = new Student(); // default student with all fields blank.
        key.setID(searchKey); // set the ID field for key to the ID entered from the user’s search request.


        //perform array binary search

        int lowerBound = 0;
        int upperBound = num-1;

        int curIn;

        while(true)
        {
            curIn = (lowerBound + upperBound) / 2;
            if(searchKey == database[curIn].getID())  {
                break;
            }
            else if(lowerBound > upperBound)   {
                break;
            }
            else
            {
                if(database[curIn].getID() < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }

        if(lowerBound > upperBound)
            System.out.println("Could not find id: " + searchKey);
        else
            System.out.println("Found Student: " + database[curIn].toString());

    }

}


