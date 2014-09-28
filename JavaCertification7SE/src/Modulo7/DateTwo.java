package Modulo7;

/**
 *
 * @author aunermedina
 */
public class DateTwo {
    public int dateNumber = 1;
    
    public void displayDay() {
        if (dateNumber == 1) {
            System.out.println("Monday");
        } else if (dateNumber == 2) {
            System.out.println("Tuesday");
        } else if (dateNumber == 3) {
            System.out.println("Wednesday");
        } else if (dateNumber == 4) {
            System.out.println("Thursday");
        } else if (dateNumber == 5) {
            System.out.println("Friday");
        } else if (dateNumber == 6) {
            System.out.println("Saturday");
        } else if (dateNumber == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please add a number from 1 to 7");
        }
    }
}
