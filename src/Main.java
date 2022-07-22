import javax.swing.text.View;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
   public static void main(String[]args) {
         run();
   }
    public static void run() {
       Scanner scan = new Scanner(System.in);
       String userInput = "n";

       while (userInput != null && !userInput.equals("")) {

           System.out.println("Enter name for new list or existing name for old lists, make sure name ends with .txt");
           userInput = scan.nextLine();

           if(!userInput.endsWith(".txt")) {
               userInput = userInput + ".txt";
           }

           File current = new File("/Users/yashabazariah/Documents/CodeProject/Lists/" + userInput);

           try {
               current.createNewFile();
               interact(current);
           } catch (IOException e) {
               System.out.println("error when creating file");
               e.printStackTrace();
           }
       }
    }

    private static void interact(File current) {
            List list = readfile(current);
            //add view exit
            Scanner scan = new Scanner(System.in);
            String userInput = "n";
            while (userInput != null && !userInput.equals("")) {

                System.out.println("Enter a command");
                System.out.println("view, add ____, exit");
                userInput = scan.nextLine();
                String clean = userInput.trim().toLowerCase(Locale.ROOT);
                String[]split = clean.split( " ");

                if(clean.startsWith("view")) {
                    printList(list);
                }
                //split.length is # of chunks
                else if(clean.startsWith("add") && split.length > 1) {
                    //we want to ignore the word add thats why it starts at one (i = 1)
                    String progress = "";
                    for (int i = 1; i < split.length; i++) {
                        //add the ith thing to progress and then add a space.

                    }

                    //after the for loop, delete the last space at the end
                    //take progress and add it to the list

                    //make a loop with an array in the loop which contains all the chunks
                    //this is the split array ex:[add, hello, my, name, is, yashab]
                    //take out the 0th position of the array, walk down the array and add all the chunks to an empty string
                    //need a variable to keep track of your progress so far, basically copying split[] into a string with spaces
                }

                else if(clean.startsWith("exit")) {
                    //to do
                }
                else {
                    System.out.println("invalid command");
                }
        }
    }

    private static void printList(List list) {
    }

    private static List readfile(File current) {

       return
               new ArrayList<>();
    }
}


//step 1 read in file and store as a list
//step 2 ask user what they wanna do (view or add)
//step 3 accept whatever they give, (this will be a loop)
//step 4 execute the command they give

//welcome screen
//do you want to continue with old list or create new (2 options)
//if want to create new create NewList
//if want to continue with old stay on most previously used list
//add to lists
//take out of lists
//should always be an option to leave list
//make folder containing all the lists created
//read in the data and store it in code
//
//