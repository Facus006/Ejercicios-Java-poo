/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12persona;

import fechas.Personainfo;
import java.util.Scanner;


/**
 *
 * @author Facu
 */
public class Ejer12Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        Personainfo c1 = new Personainfo();
        c1.CrearPersona();
        c1.SaberEdad();
       
        Personainfo c2 = new Personainfo();
        c2.CrearPersona();
        c2.SaberEdad();
        
        int edad = c2.getEdad();
        c1.menorque(edad);
        
        c2.MostrarPersona();

    }
    
}
