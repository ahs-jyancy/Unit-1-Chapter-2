
/**
 * Jon Yancy
 * Programming III
 * Stock Transaction Program
 * 9/22/20
 */
public class StockTransactionProgram {

    public static void main(String[] args) {
        // TODO code application logic here
        double pricePerStock1 = 32.87;
        double pricePerStock2 = 33.92;
        double shares = 1000;
        double commission1;
        double stock1;
        double stock2;
        double commission2;
        double profit;
        double broker;
        double overall;
        
        stock1 = shares * pricePerStock1; 
        commission1 = stock1 * 0.02;
                

        System.out.println("He paid a total of $" + (int)stock1 + 
                " for the first"
                + " stock." );
        System.out.println("He paid the broker $" + commission1 + " in "
                + "commission.");
        
        stock2 = shares * pricePerStock2;
        commission2 = stock2 * 0.02;
        
        System.out.println("He sold his stock for $"+ (int)stock2 +".");
        System.out.println("He paid the broker $"+ commission2 + 
                " in commission.");
        
        profit = stock2 - stock1;
        broker = commission2 - commission1;
        
        overall = profit - broker;
        
        System.out.println("He made a profit of $" + (int)profit + 
                " from the first"
                + " stock he purchased.");
        System.out.println("He paid the broker $" + (int)broker + 
                " more dollars than"
        + " the first time.");
        System.out.println("He made a overall profit of $" + (int)overall +".");



    }

}
