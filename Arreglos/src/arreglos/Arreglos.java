/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import matriz.Matriz;

/**
 *
 * @author Facu
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriz m1 = new Matriz();
         m1.llenar();
         System.out.println("//////////");
         m1.ordenar();
         System.out.println("/////////");
         m1.ordenarM20();
        // TODO code application logic here
    }
    
}
