
/**
 * Jon Yancy
 * Programming III
 * String Method Examples
 * 9/16/20
 */

import java.util.Scanner;

public class StringMethodExamples {

    public static void main(String[] args) {
        //create scanner object
        Scanner k = new Scanner(System.in);
        //declare variables
        String name;
        int nameLength;
        char firstLetter;
        char lastLetter;
        
        //ask for user name
        System.out.print("What is your name? ");
        name = k.next();
       
        //toUppercase example
        System.out.println("This is your name in "
                + "ALL CAPS: " + name.toUpperCase());
        
        System.out.println("");  //blank line for space
        
        //toLowercase example
        System.out.println("This is your name in "
        + "all lowercase: " + name.toLowerCase());
        
        System.out.println(""); //blank line for space
        
        //charAt examples
        firstLetter = name.charAt(0);
        lastLetter = name.charAt(name.length()-1);
        
        System.out.println("The first letter in your name is: " 
        + firstLetter);
        
        System.out.println(""); //blank line for space
        
        System.out.println("The last letter in your name is: "
        + lastLetter);
        
        System.out.println(""); //blank line for space
        
        nameLength = name.length();
        System.out.println("Your name has " + nameLength + " letters in it.");




    }

}
