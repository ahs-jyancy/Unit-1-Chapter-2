
/**
 * Jon Yancy
 * Programming III
 * Expressions and Assignment Statements
 * 9/14/20
 */
public class ExpressionsAndAssignmentStatements {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        This program calculates the sale price of an item that is regulary
        priced at $59, with 20% discount subtracted
        */

        double regularPrice = 59.0;
        double discount;
        double salePrice;
        
        //Calculate the discount
        discount = regularPrice * .2;
        
        //Calculate the sale price
        salePrice = regularPrice - discount;
        
        //Print out the results
        System.out.println("Regular Price: $" + regularPrice);
        System.out.println("Discount Amount: $" + discount);
        System.out.println("Sale Price: $" + salePrice);


    }

}
