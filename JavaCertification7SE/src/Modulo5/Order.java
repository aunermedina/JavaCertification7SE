package Modulo5;

/**
 *
 * @author aunermedina
 */
public class Order {
    long orderValue = 0L;
    int itemQuantity = 10_000_000;
    int itemPrice = 555_500;
    
    public void calculateTotal() {
        orderValue = (long)itemQuantity * (long)itemPrice;
        System.out.println("Order total is: " + orderValue);
    }
}
