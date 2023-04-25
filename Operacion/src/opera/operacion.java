/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opera;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class operacion {
    Scanner leer= new Scanner (System.in);
    private int num1;
    private int num2;

     public operacion() {
         
    }
     
    public operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

   public int  crearOperacion() {
       System.out.println("Ingrese un numero");
        this.num1= leer.nextInt();
        return num1;
       
   } 
   public int crearOperacion2() {
       System.out.println("Ingrese otro numero");
       num2= leer.nextInt();
       return num2;
   }
   public int suma() {
       int suma=num1+num2;
       System.out.println("La suma de "+num1+"+"+num2+"="+suma);
       return suma;
   }
    public int resta() {
        int resta = num1 - num2;
        System.out.println("La resta de "+num1+"-"+num2+"="+resta);
        return resta;
    }
 
    public int multi(){
        int multi = num1*num2;
        System.out.println("La multiplicacion de "+num1+"*"+num2+"="+multi);
        return multi;
    }

    public double divi() {
        double divi = num1 / num2;
        System.out.println("La division de "+num1+"/"+num2+"="+divi);
        return divi;
    }
    
    
   
}
