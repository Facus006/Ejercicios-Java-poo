/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frase;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Frase {
    public String frase;
    public int longitud;

    public Frase() {
    }

    public Frase(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }
    
    

    public void  Frase(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

  
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public void Vocales() {
        int cont=0;
        for (int i = 0; i < this.longitud; i++) {
            if ((this.frase.charAt(i)=='a') || (this.frase.charAt(i)=='e')
                   ||(this.frase.charAt(i)=='i') || (this.frase.charAt(i)=='o') 
                    || (this.frase.charAt(i)=='u')) {
                cont++;
            }
            
        }
        System.out.println("hay "+cont+" vocales en la frase ingresada");
    }
 
    public void Invertir() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder(frase);
        String invertida= stringBuilder.reverse().toString();
        System.out.println(invertida);
      
        
    }
    
    public void buscarLetra() {
        Scanner leer= new Scanner (System.in);
        int cont=0;
        System.out.println("Ingrese una letra");
        char letra = leer.next().charAt(0);
        
        for (int i = 0; i < this.longitud; i++) {
            if ((this.frase.charAt(i)==letra)) {
                cont++;
            }
        }
        System.out.println("La letra "+letra+" se repite "+cont+" veces");
        
        
    }
    
    public void compararLongitud(){
        Scanner leer= new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese otra frase");
        String frase2 = leer.next();
        System.out.println("La primer frase tiene una longitud de "+longitud
        + " y la segunda frase ingresada tiene una longitud de "+frase2.length()+".");
        
    }
    
    public void unirFrase() {
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase para unirlas");
        String frase2= leer.next();
        //String frase3= this.frase + frase2;
        System.out.println(this.frase+" "+frase2);
    }
    
    
    public void reemplazar() {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese un caracter para reemplazar las 'a' ");
        String letra = leer.next();
        String letraNueva= frase.replaceAll("a", letra).replace("A", letra.toUpperCase());
        System.out.println(letraNueva);
    }
    
    public boolean contiene() {
        Scanner piola = new Scanner(System.in);
        boolean retorno= false;
        System.out.println("Ingrese una letra");
        char letra= piola.next().charAt(0);
        for (int i = 0; i < longitud; i++) {
            if ((frase.charAt(i)==letra)) {
                retorno=true;
            }
            
        }
        
        System.out.println(retorno);
        
        return retorno;
    } 
    
    
    
    
}
