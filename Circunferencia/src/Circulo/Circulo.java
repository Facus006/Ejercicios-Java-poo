package Circulo;

import circunferencia.Circunferencia;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Facu
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        
        System.out.println("Ingrese el radio");
         double radio = leer.nextDouble();
        
        Circunferencia c1= new Circunferencia(radio);
         c1.area();
         c1.perimetro();
        System.out.println(c1);
        
        // TODO code application logic here
    }
    
}
