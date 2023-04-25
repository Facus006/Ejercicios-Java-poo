/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Scanner;
        

/**
 *
 * @author Facu
 */
public class Persona {
    public String nombre;
    public int edad;
    public String sexo;
    public int peso;
    public double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void Persona(String nombre, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("NOMBRE");
        nombre = leer.next();
        System.out.println("EDAD");
        edad = leer.nextInt();
        do {
            System.out.println("SEXO");
            sexo = leer.next();
            if (!sexo.toLowerCase().equals("h") && !sexo.toLowerCase().equals("m")
                    && !sexo.toLowerCase().equals("o")) {
                System.out.println("ERROR COMPLETE SOLO CON H,M,O");
            }
        } while (!sexo.toLowerCase().equals("h") && !sexo.toLowerCase().equals("m")
                && !sexo.toLowerCase().equals("o"));
        
        System.out.println("PESO");
        peso = leer.nextInt();
        System.out.println("ALTURA");
        altura = leer.nextDouble();

    }

    public int IMC() {
        int imc = (int) (this.peso/(this.altura*this.altura));
        
        int retorno=1957;
        if (imc<20) {
           
            retorno= -1;
            
        }
        if (imc>=20 && imc<=25) {
           
           retorno = 0; 
        }
        if (imc>25) {
           
            retorno=1;
        }
       
        return retorno;
    }
    
    public boolean esMayor() throws PersonaExepcion {
        boolean retorno = true;
        if (this.edad < 18) {
            
            retorno = false;
        }
        if (this.edad >= 18) {
            
        }
        
        try {
            if (edad == 0) {
                throw new PersonaExepcion("Error ingrese una edad valida");
            }
        } catch (PersonaExepcion e) {
           throw new PersonaExepcion("error de sistema"); 
        }
        return retorno;
    }
    
    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

   
    
  
    
}
