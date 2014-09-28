package Modulo10;

/**
 *
 * @author aunermedina
 */
public class Rambo {
    public void mataMarciano(){
        if(Marciano.cuentaMarciano > 0) {
            Marciano.cuentaMarciano--;
            System.out.println("Marciano muerto!");
        } else {
            System.out.println("Ya no hay marcianos que matar!");
        }
    }

}
