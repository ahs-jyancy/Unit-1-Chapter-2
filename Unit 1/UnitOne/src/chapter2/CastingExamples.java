
/**
 * Jon Yancy
 * Programming III
 * Casting Examples
 * 9/18/20
 */
public class CastingExamples {

    public static void main(String[] args) {
        //demonstrate casting using division
        
        System.out.println(6/4); //result is int
        System.out.println(6.0/4); //result is double 
        System.out.println(6/4.0); //result is double
        System.out.println((double)6/4); //int cast as double
        System.out.println((int)6.0/4); //double cast as int

        //rounding positive numbers
        double number = 11.0/4;
        int roundedNumber = (int)(number + 0.5);
        System.out.println("11.0 / 4 = " + number);
        System.out.println("11 / 4 = " + (int)number);
        System.out.println("11.0 / 4 rounded = " + roundedNumber);
        
        System.out.println("");
        
        //rounding negative numbers 
        number = 11.0/4;
        double negativeNumber = -number;
        int roundedNegativeNumber = (int)(negativeNumber - 0.5);
        System.out.println("-11.0 / 4 rounded = ");
        System.out.println(roundedNegativeNumber);
        



    }

}
