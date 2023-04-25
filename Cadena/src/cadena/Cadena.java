/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import frase.Frase;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        // TODO code application logic here
        Frase f1 = new Frase();
        System.out.println("Ingrese una frase");
        String frase= leer.next();
        int longitud= frase.length();
        f1.Frase(frase,longitud);
        //f1.Vocales();
        //f1.Invertir();
        //f1.buscarLetra();
        //f1.compararLongitud();
       // f1.unirFrase();
        //f1.reemplazar();
       //f1.contiene();
       
        
        
    }
    
}
