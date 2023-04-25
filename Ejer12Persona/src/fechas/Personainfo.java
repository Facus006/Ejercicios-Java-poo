/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Personainfo {
    private String nombre;
    private Date fecha;
    private int edad;
  
    public Personainfo() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Personainfo(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public void CrearPersona() {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre completo");
        this.nombre = leer.next();
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia de nacimiento");
        int dia = leer.nextInt();
        this.fecha = new Date(anio-1900, mes-1 , dia);
     
    }
    
    public void SaberEdad() {
      Date fechaAct = new Date();
       this.edad =  fechaAct.getYear() - fecha.getYear(); 
      
        
    }

   public boolean menorque(int edad2) {
       boolean retorno = false;
      
       if (edad2<edad) {
           retorno=true;
       }
       if (edad>edad) {
           retorno=false;
       }
       
      return retorno;  
   } 

   public void MostrarPersona() {
       
       System.out.println("El nombre completo es "+nombre+" Y la fecha de nacimiento es "+ fecha);
         System.out.println("La edad es de "+ edad);
   }
   
   

    
   
   
   
  

    
   

 
   
    
    
}
