/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Circunferencia {

    private double radio;
    public double area;
    public double perimetro;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

  
    public double getRadio() {
        return radio;
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

  

    public double area() {
        area = 3.14 * Math.pow(radio, 2);
        return area;
    }

    public double perimetro() {
        perimetro = 2 * 3.14 * radio;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

    

   
    

  
    
}
