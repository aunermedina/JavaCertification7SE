package Modulo9;

/**
 *
 * @author aunermedina
 */
public class BreakBubles {
    public static void main(String[] args) {
        int passmark = 12;
        boolean passed = false;
        
        int[] score = {4,6,2,8,12,34,9};
        
        for (int unitScore : score) {
            if (unitScore > passmark) {
                passed = true;
                break;
            }
        }
        System.out.println("One or more units passed? " + passed);
    }
}
