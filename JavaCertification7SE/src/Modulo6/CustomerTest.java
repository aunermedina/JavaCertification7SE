package Modulo6;

/**
 *
 * @author aunermedina
 */
public class CustomerTest {
    public static void main(String[] args) {
    
        Customer cust1, cust2;
        cust1 = new Customer();
        cust2 = new Customer();
        
        cust1.customerID = 1;
        cust1.emailAddress = "wsmith@gmail.com";
        cust1.name = "Juan Camaney";
        
        cust2.customerID = 2;
        cust2.emailAddress = "yolastengotodas@gmail.com";
        cust2.name = "el tun tun";
        
        cust1 = cust2;
        cust1.displayCustomerInfo();
        //cust2.displayCustomerInfo();
    }
    
    
}
