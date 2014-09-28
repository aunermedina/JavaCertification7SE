package Modulo8;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aunermedina
 * @fecha Sáb 13 de Septiembre 2014.
 * 
 */

public class ArrayBDimensional {
    public static void main(String[] args) {
        //Tipos Primitivos
        byte [][] edades1 = new byte[4][3];
        short [][] edades2 = new short[5][1];
        int [][] edades3 = new int[6][1];
        long [][] edades4 = new long[10][1];
        
        //Tipos Clase
        String [][] nombres = new String[3][2];
        Integer [][] enteros = new Integer [4][2];
        Shirt [][] camisasPorCategorias = new Shirt[5][2];
        Date [][] fechas = new Date[3][2];
        
        ArrayList camisas = new ArrayList();
        
        camisas.add(new Shirt(1,"Polo",250));
        camisas.add(new Shirt(2,"Polo",250));
        camisas.add(new Shirt(3,"Polo",250));
        
    }
}
