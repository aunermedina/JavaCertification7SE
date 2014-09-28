package Modulo10;

/**
 *
 * @author aunermedina
 * @date 27 Sept 2014
 * 
 */
public class Sobrecarga {
    
    public void metodo (int x, int y) {
        int result = x * y;
        System.out.println("Dos enteros = " + result);
    }
    
    public void metodo(int x) {
        int result = x + 2;
        System.out.println("Entero + 2 = " + result);
    }
    
    public static void main(String[] args) {
        Sobrecarga obj = new Sobrecarga();
        int ent1 = 4;
        int ent2 = 5;
        int ent3 = 20;
        obj.metodo(ent1, ent2);
        obj.metodo(ent3);
    }
}
