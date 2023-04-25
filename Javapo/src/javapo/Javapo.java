/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapo;

import javapo.auto.Auto;

/**
 *
 * @author Facu
 */
public class Javapo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Auto m1= new Auto("volkswagen", "Bora", 1.8);
       
      
        System.out.println("La marca del auto es "+m1.setmarca(String marca)+" "+m1.setnombre(String nombre)+" "+m1.setmotor(double motor));
    }
    
}
