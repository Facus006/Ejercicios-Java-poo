 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
    
        System.out.println("Ingrese el numero del mes");
        int mes = leer.nextInt();
     
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
         
        Date fecha2 = new Date(anio-1900, mes-1, dia);
        
        System.out.println(fecha);
        System.out.println(fecha2);
        
        int fechovich = fecha.getYear() - fecha2.getYear();
        
        System.out.println("La diferencia de años es: "+ fechovich);
        
        
        
      
        
        
        
        // TODO code application logic here
    }
    
}
