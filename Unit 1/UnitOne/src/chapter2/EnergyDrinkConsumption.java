
/**
 * Jon Yancy
 * Programming III
 * Energy Drink Consumption
 * 9/21/20
 */
public class EnergyDrinkConsumption {

    public static void main(String[] args) {
        // TODO code application logic 
      double customers = 12467;
      double energyDrink = .14;
      double citrus = .67;
      double percentageOne;
      double percentageTwo;
      
        System.out.println("This survey was out of 12,467 people");
      
      percentageOne = customers * energyDrink;
      
        System.out.println("The amount of people that drink one or more "
                + "energy drinks per week is approximately " + 
                (int)percentageOne);
        percentageTwo = customers * citrus;
        
        System.out.println("The amount of people that prefer citrus flavored"
                + " energy drinks is approximately " + (int)percentageTwo);
      
       
     
        





    }

}
