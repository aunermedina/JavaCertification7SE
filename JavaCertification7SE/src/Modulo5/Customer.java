package Modulo5;

/**
 *
 * @author aunermedina
 */
public class Customer {
    public int customerID = 0; // Default ID for new customer
    public char status = 'N'; // N for new and O for old.
    public double totalPurchases = 0.0; // Default amount for totalPurchases
    
    public void displayCustomerInfo() {
        System.out.println("Customer's information:");
        System.out.println("-----------------------------------");
        System.out.println("Customer's ID: " + customerID);
        System.out.println("Customer's Status: " + status);
        System.out.println("Customer's total purchases: $" + totalPurchases);
        System.out.println("-----------------------------------");
    }
}
