package Modulo8;

/**
 *
 * @author aunermedina
 */
public class Arrays1 {

    public static void main(String[] args) {
        int[] edades = new int[4];
        edades[0] = 25;
        edades[1] = 30;
        edades[2] = 35;
        edades[3] = 40;
        //System.out.println("Person's age three: " + edades[2]);

        String[] nombres = new String[3];
        nombres[0] = "Carlos";
        nombres[1] = "Auner";
        nombres[2] = "Marcelino";
        //System.out.println("Nombre de la persona 2: " + nombres[1]);

        Shirt[] camisas = new Shirt[7];
        camisas[0] = new Shirt(1, "Squalo", 250.00);
        camisas[1] = new Shirt(2, "Fila", 250.00);
        camisas[2] = new Shirt(3, "GAT", 350.00);
        camisas[3] = new Shirt(4, "Panchios", 150.00);
        camisas[4] = new Shirt(5, "Polo", 240.00);
        camisas[5] = new Shirt(6, "Cuello V", 50.00);
        camisas[6] = new Shirt(7, "PRO Combat", 550.00);
        
        // camisas[3].displayInformation();
        
        for (int i = 0; i < camisas.length; i++) {
            camisas[i].displayInformation();
        }

    }
}
