package Modulo5;

/**
 *
 * @author aunermedina
 */
public class Person {
    public int years = 26, days;
    public long minutes, seconds, miliseconds;
    
    public void calculateAge() {
        
        days = years * 365;
        seconds = days * 24 * 60 * 60;
        minutes = seconds / 60;
        miliseconds = seconds * 1000;
        
        System.out.print("\nYou are " + days + " days old.");
        System.out.print("\nYou are " + seconds + " seconds old.");
        System.out.print("\nYou are " + minutes + " minutes old.");
        System.out.print("\nYou are " + miliseconds + " miliseconds old.\n");
    }    
}
