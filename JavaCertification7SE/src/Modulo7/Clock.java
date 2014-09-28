package Modulo7;

/**
 *
 * @author aunermedina
 */
public class Clock {
    public int now = 0500;
    
    public void displayPartOfDay() {
        if (now >= 801 && now <= 1200) {
            System.out.println("Morning.");
        } else if (now >= 1201 && now <= 1900) {
            System.out.println("Afternoon.");
        } else if (now >= 1901 && now <= 2400) {
            System.out.println("Evening.");
        } else {
            System.out.println("Early morning.");
        }
    }
}
