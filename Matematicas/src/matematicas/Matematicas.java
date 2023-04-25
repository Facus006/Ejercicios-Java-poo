/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

import ecuaciones.ecuacion;

/**
 *
 * @author Facu
 */
public class Matematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ecuacion m1= new ecuacion();
        double num1= (double) (Math.random()*100+1);
         double num2= (double) (Math.random()*100+1);
         m1.ecuacion(num1, num2);
         m1.encontrarMayor();
         m1.potencia();
        m1.raiz();
        System.out.println(m1);
        
         
    }
    
}
