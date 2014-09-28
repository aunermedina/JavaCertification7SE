package Modulo6;

/**
 *
 * @author aunermedina
 */
public class PersonTwo {
    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();
    
    public void displayPersonInfo() {
        name.append("Fernando");
        name.append(" ");
        name.append("Gonzalez");
        
        System.out.println("Name: " + name.toString());
        System.out.println("Name object capacity: " + name.capacity());
        
        phoneNumber.append("3312286886");
        phoneNumber.insert(3, "-");
        phoneNumber.insert(7, "-");
        
        System.out.println("Phone Number: " + phoneNumber.toString());
        System.out.println("First Name: " + name.substring(0, 8));
        System.out.println("Last Name: " + name.substring(9, 17));
        System.out.println("Last Name Replaced: " + name.replace(9, 17, "Montejano"));
    }
}
