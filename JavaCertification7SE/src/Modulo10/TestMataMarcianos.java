package Modulo10;
public class TestMataMarcianos {
    public static void main(String[] args) {
        Rambo rambo = new Rambo();
        Santo santo = new Santo();
        
        santo.mataMarciano();
        santo.mataMarciano();
        santo.mataMarciano();
        rambo.mataMarciano();
        rambo.mataMarciano();
        rambo.mataMarciano();
        
        System.out.println("La cuenta de marcianos es: " + Marciano.cuentaMarciano);
    }
}
