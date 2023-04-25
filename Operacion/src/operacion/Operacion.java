/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import opera.operacion;

/**
 *
 * @author Facu
 */
public class Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operacion uno = new operacion();
        uno.crearOperacion();
        uno.crearOperacion2();
        uno.suma();
        uno.resta();
        uno.multi();
        uno.divi();
        
        
    }
    
}
