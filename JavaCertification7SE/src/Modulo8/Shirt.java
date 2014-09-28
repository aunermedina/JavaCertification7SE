package Modulo8;

/**
 *
 * @author aunermedina
 * @since Sábado, 30 de Agosto de 2014
 * 
 */
public class Shirt {
    
    public int shirtID;
    public String description = "-description is required-"; //default
    public double price = 0.0; //default price for all shirts
    
    
    // Constructor clase shirt :)
    public Shirt(int ShirtID, String Description, double Price) {
        shirtID = ShirtID;
        description = Description;
        price = Price;
    }
    
    //this method displays the values for an item
    public void displayInformation() {
        //System.out.println("Shirt's information: \n");
        System.out.println("Shirt ID: \t\t" + shirtID);
        System.out.println("Shirt description: \t" + description);
        System.out.println("Shirt price: \t\t$" + price + "\n");
    } //end of the method
    
} // end of the class
