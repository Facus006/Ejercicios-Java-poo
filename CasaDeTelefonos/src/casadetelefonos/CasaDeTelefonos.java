/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadetelefonos;

import Celulares.movil;

/**
 *
 * @author Facu
 */
public class CasaDeTelefonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        movil celular1 = new movil();
        celular1.cargarCelular();
        celular1.IngresarCodigo();
        System.out.println(celular1);
        
    }
    
}
