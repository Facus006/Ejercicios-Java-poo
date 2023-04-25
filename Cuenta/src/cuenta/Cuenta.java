/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

import archivos.datos;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int opc;
        int cant;
        datos c1= new datos();
        System.out.println("Ya tiene una cuenta en nuestro banco?");
        String resp = leer.next();
        
        if (resp.toLowerCase().equals("no")) {
            System.out.println("Desea Crear una cuenta nueva?");
            String opc2= leer.next();
            if (opc2.toLowerCase().equals("si")) {
                c1.newCuenta();
                resp="si"  ;
            } else {
               if (opc2.toLowerCase().equals("no")) {
                   opc=6;
               } 
            }
        }
           if (resp.toLowerCase().equals("si")) {
            System.out.println("Ingrese el numero de su cuenta");
            int numCuenta= leer.nextInt();
            System.out.println("Ingrese su numero de documento");
            int numDoc= leer.nextInt();
            System.out.println("Ingrese su saldo actual");
            int nsaldo= leer.nextInt();
            c1.edatos(numCuenta, numDoc, nsaldo);
            
        
            do {  
                System.out.println("");
                System.out.println("Ingrese que desea hacer");
                System.out.println("1-Ingresar dinero");
                System.out.println("2-Retirar dinero");
                System.out.println("3-Extraccion rapida");
                System.out.println("4-Consultar saldo");
                System.out.println("5-Consultar datos");
                System.out.println("6-SALIR");
                opc= leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Ingrese la cantidad que desea ingresar");
                         cant= leer.nextInt();
                        c1.ingresar(cant);
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de dinero a retirar");
                         int cant2 = leer.nextInt();
                         c1.retirar(cant2);
                         
                        break;
                    case 3: 
                        c1.retirorapido();
                        break;
                    case 4:
                        c1.consultarsaldo();
                        break;
                    case 5:
                        c1.consultardatos();
                        break;
                    
                }
            } while (opc!=6);
           }
            
        
 
        // TODO code application logic here
    }
    
}
