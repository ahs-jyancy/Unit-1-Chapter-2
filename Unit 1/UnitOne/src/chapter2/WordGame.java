
import java.util.Scanner;


/**
 * Jon Yancy
 * Programming III
 * Word Game
 * 9/21/20
 */

public class WordGame {

    public static void main(String[] args) {
        // TODO code application logic here
  System.out.println("What is your name?");
           Scanner keyboard = new Scanner(System.in);
           //No spaces for the scanner to work correctly
          String name = keyboard.next();
           System.out.println("How old are you? ");
          int age = keyboard.nextInt();
           System.out.println("What city do you live in?");
          String city = keyboard.next();
           System.out.println("What college do you go to?");
          String college = keyboard.next();
           System.out.println("What is your profession?");
          String profession = keyboard.next();
           System.out.println("What is your favorite animal?");
          String animal = keyboard.next();
           System.out.println("What is your Pet's name?");
          String petName = keyboard.next();
          
           System.out.println("There once was a person named " + name + " who"
                   + " lived in " + city + ". At the age of " + age + ", " + 
                   name + " went to college at " + college + ". " + name +
                   " graduated and went to work as a " + profession + 
                   ". Then, " + name + " adopted a(n) " + animal + " named " +
                   petName + ". They both lived happily ever after!");




    }

}
