/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;

import Cafetera.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner leer = new Scanner (System.in);
           Cafetera cafe= new Cafetera();
           int opc;
           
        System.out.println("Ingrese la cantidad maxima de su cafetera");
        int max = leer.nextInt();
        System.out.println("Ingrese la cantidad de Cafe actual de su cafetera ");
        int atc = leer.nextInt();
        cafe.Cafetera(max, atc);
        
        do { 
            
            System.out.println("ELIJA UNA OPCION");
            System.out.println("1-Llenar Cafetera");
            System.out.println("2-Servir una taza");
            System.out.println("3-Vaciar Cafetera");
            System.out.println("4-Agregar Cafe");
            System.out.println("5-SALIR");
            System.out.println("6-Consu");
            opc= leer.nextInt();
            
            switch (opc) {
                case 1:
                    cafe.llenarCafetera();
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de las tazas");
                    int tazas = leer.nextInt();
                    cafe.servirTaza(tazas);
                    break;
                case 3:
                    cafe.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Ingrese cuanto cafe desea ingresar");
                    int act = leer.nextInt();
                    cafe.agregarCafe(act);
                    break;
                case 6:
                    cafe.consultar();
                    break;
                    
        }
            
        } while (opc!=5);
       
        
    
     
        
    }
    
   
        
    
}
