package Modulo9;

/**
 *
 * @author aunermedina
 */
public class Breaker3 {

    public static void main(String[] args) {
        go();
    }
    
    public static void go(){
        /*String o = "";
        z:
        for (int i = 0; i < 3; i++) {
            for ( int j = 0; j < 2; j++) {
                if (i == 1) break;
                if (i == 2 && j == 1) break z;
                o = o + i + j;
            }
        }
        System.out.println(" " + o);*/
        
        int x = 2, y = 3, z = 4;
        int j = 0, k =0;
        for (int i = 0; i<x; i++){
            do {
                k = 0;
                while (k < z) {
                    k++;
                    System.out.println(k + " ");
                }
                System.out.println(" ");
                j++;
            } while (j < y);
            System.out.println("----");
        }
    }
}
