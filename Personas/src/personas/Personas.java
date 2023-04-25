/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import Persona.Persona;

/**
 *
 * @author Facu
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mayor = 0;
        int menor=0;
        int pesoIdeal=0;
        int sobrepeso=0;
        int bajopeso=0;
        // PERSONA 1
        Persona p1 = new Persona();
        p1.Persona("Facu", 19, "h", 55, 1.51);
        if (p1.IMC()==0) {
            pesoIdeal++;
        }
        if (p1.IMC()==1) {
            sobrepeso++;
        }
        if (p1.IMC()==-1) {
            bajopeso++;
        }
         if (p1.esMayor()==true) {
            mayor++;
        }else{
            menor++;
        }
        System.out.println(p1);
        
       //   PERSONA 2 
       
        Persona p2 = new Persona();
        p2.Persona("Facu", 19, "h", 55, 1.51);
         if (p2.IMC()==0) {
            pesoIdeal++;
        }
        if (p2.IMC()==1) {
            sobrepeso++;
        }
        if (p2.IMC()==-1) {
            bajopeso++;
        }
         if (p2.esMayor()==true) {
            mayor++;
        }else{
            menor++;
        }
        System.out.println(p2);
        
       // PERSONA 3
       
        Persona p3 = new Persona();
        p3.Persona("Facu", 19, "h", 55, 1.51);
         if (p3.IMC()==0) {
            pesoIdeal++;
        }
        if (p3.IMC()==1) {
            sobrepeso++;
        }
        if (p3.IMC()==-1) {
            bajopeso++;
        }
         if (p3.esMayor()==true) {
            mayor++;
        }else{
            menor++;
        }
        System.out.println(p3);
        
        //PERSONA 4
        
        Persona p4 = new Persona();
        p4.Persona("Facu", 19, "h", 55, 1.51);
         if (p4.IMC()==0) {
            pesoIdeal++;
        }
        if (p4.IMC()==1) {
            sobrepeso++;
        }
        if (p4.IMC()==-1) {
            bajopeso++;
        }
        if (p4.esMayor()==true) {
            mayor++;
        }else{
            menor++;
        }
        System.out.println(p4);
        
        
        
        System.out.println(bajopeso+" Pesonas tienen bajo peso");
        System.out.println(pesoIdeal+" Personas estan en el peso ideal");
        System.out.println(sobrepeso+" Personas tienen sobrepeso");
        System.out.println(mayor+" Personas son mayores de edad");
        System.out.println(menor+" Personas son menores de edad");
        int a =100;
        int b= 50;
        a = a + b;
        b = a-b;
        a= a-b;
        System.out.println("a="+a+"b="+b);
    }
    
}
