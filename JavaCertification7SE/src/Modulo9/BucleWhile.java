package Modulo9;

/**
 *
 * @author aunermedina
 * @date Sat, Sept 20 2014
 * 
 */
public class BucleWhile {
    public static void main(String[] args) {
        float square = 4;
    float squareRoot = square;
    
    while (squareRoot * squareRoot - square > 0.001) {
        squareRoot = (squareRoot + square/squareRoot)/2;
        System.out.println("Next try will be " + squareRoot);
    }
        System.out.println("Square root of " + square + " is " + squareRoot);
    }
    
}
