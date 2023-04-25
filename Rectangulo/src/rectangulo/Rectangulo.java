/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;
import rec.rectangulo;

/**
 *
 * @author Facu
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la altura del rectangulo");
        int alt = leer.nextInt();
        System.out.println("Ingrese el tamaño de la base");
        int bse = leer.nextInt();
        rectangulo r1 = new rectangulo(alt,bse);
        r1.perimetro();
        r1.superficie();
        r1.construir();
        System.out.println(r1);
        
        // TODO code application logic here
    }
    
}
