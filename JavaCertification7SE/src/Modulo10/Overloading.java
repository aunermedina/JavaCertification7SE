package Modulo10;

/**
 *
 * @author aunermedina
 * @date 27 sept 2014
 *
 */
public class Overloading {

    public static void JavaHungry(String s) {
        System.out.println("String");
    }
    
    public static void JavaHungry(Object o) {
        System.out.println("Object");
    }
    
    public static void JavaHungry(Integer e) {
        System.out.println("Integer");
    }
    
    public static void main(String[] args) {
        JavaHungry("Hello");
    }
}
