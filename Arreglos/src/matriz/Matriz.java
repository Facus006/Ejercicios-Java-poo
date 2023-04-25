/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Arrays;

/**
 *
 * @author Facu
 */
public class Matriz {
    public double []  matriz50= new double [50] ;
    public double []  matriz20= new double [20] ; 

    public Matriz() {
    }

    public Matriz(double[]  matriz50, double[]   matriz20) {
        this.matriz50 = matriz50;
        this.matriz20 = matriz20;
    }

    public double[] getMatriz50() {
        return matriz50;
    }

    public void setMatriz50(double[] matriz50) {
        this.matriz50 = matriz50;
    }

    public double[] getMatriz20() {
        return matriz20;
    }

    public void setMatriz20(double[] matriz20) {
        this.matriz20 = matriz20;
    }
    
    
    
    public void llenar() {
        
        for (int i = 0; i < 50; i++) {
           
                matriz50 [i] = Math.random();
                matriz50 [i] = Math.round( matriz50 [i]*1000.00)/100.00;
                
               
            }
            System.out.println(Arrays.toString(matriz50));
        
    }
    
    public void ordenar() {
       Arrays.sort(matriz50);
       System.out.println(Arrays.toString(matriz50));
        

    }
    
    public void ordenarM20() {
        for (int i = 0; i < 10; i++) {
            matriz20 [i] = matriz50 [i];
        }
        for (int i = 10; i < 20; i++) {
            matriz20 [i]= 0.5;
        }
        System.out.println(Arrays.toString(matriz20));
        
    }

    
    
    
}

 
