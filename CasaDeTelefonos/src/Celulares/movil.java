/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celulares;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class movil {
    private String marca;
    private String precio;
    private String modelo;
    private String memoriaRam;
    private String almacenamiento;
    private String [] codigo = new String [7];

    public movil() {
    }

    public movil(String marca, String precio, String modelo, String memoriaRam, String almacenamiento) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String[] getCodigo() {
        return codigo;
    }

    public void setCodigo(String[] codigo) {
        this.codigo = codigo;
    }
    
    public void cargarCelular(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese la marca del celular");
        marca = leer.next();
        System.out.println("Ingrese el modelo del celular");
        modelo = leer.next();
        System.out.println("Ingrese el precio");
        precio = leer.next();
        System.out.println("Ingrese la capacidad de la memoria ram");
        memoriaRam = leer.next();
        System.out.println("Ingrese la capacidad de almacenamiento");
        almacenamiento = leer.next();
         
    }

    public void IngresarCodigo(){
      Scanner leer = new Scanner (System.in).useDelimiter("\n");
       for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el nº"+i+" del codigo");
            codigo [i]= leer.next();
            
        }
    }
    
    
    
    @Override
    public String toString() {
        return "movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", codigo=" + Arrays.toString(codigo) + '}';
    }
    

    
    
    
    
}
