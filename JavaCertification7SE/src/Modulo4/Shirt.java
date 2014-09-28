package Modulo4;

/**
 *
 * @author aunermedina
 */
public class Shirt {
    public int shirtID;
    public String description = "-description is required-"; //default
    public char colorCode = 'U'; // the color codes are R=red, G=Green, U=Unset
    public double price = 0.0; //default price for all shirts
    public int quantityInStock;
    
    public void displayShirtInformation() {
        System.out.println("Shirt's information: \n");
        System.out.println("Shirt ID: \t\t" + shirtID);
        System.out.println("Shirt description: \t" + description);
        System.out.println("Color Code: \t\t" + colorCode);
        System.out.println("Shirt price: \t\t$" + price);
        System.out.println("Quantity in stock: \t" + quantityInStock + " item(s)");
    }
}
