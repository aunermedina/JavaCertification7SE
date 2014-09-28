package Modulo9;

/**
 *
 * @author aunermedina
 */
public class Breaker {

    static String o = "";
    public static void main(String[] args) {
        o = o + 2;
        z:
        for (int i = 3; i < 8; i++) {
            if (i==4) continue;
            if (i==6) break z;
            o = o + 1;
        }
        System.out.println(o);
    }
}
