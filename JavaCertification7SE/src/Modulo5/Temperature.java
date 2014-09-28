package Modulo5;

/**
 *
 * @author aunermedina
 */
public class Temperature {
    public float fahrenheitTemp = 78.9F;
    
    public void calculateCelsius() {
        System.out.println("The celsius temp is: " + (fahrenheitTemp - 32) * 5 / 9);
    }
}
