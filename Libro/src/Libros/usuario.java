/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class usuario {
    Scanner leer = new Scanner (System.in).useDelimiter("\n"); 
    public String usuario;

    public usuario() {
    }

    public usuario(String usuario) {
        
        System.out.println("Ingrese su usuario");
        this.usuario = leer.next();
        
    }

    
}
