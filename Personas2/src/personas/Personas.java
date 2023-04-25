/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import Persona.Persona;
import Persona.PersonaExepcion;

/**
 *
 * @author Facu
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PersonaExepcion {
        // TODO code application logic here
        Persona P1 = new Persona();
        P1.esMayor();
        System.out.println(P1.getEdad());
       
    }
    
}
