/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera;

/**
 *
 * @author Facu
 */
public class Cafetera {
   private int capacidadMaxima;
   private int cantAct;

    public Cafetera() {
    }

    public void Cafetera(int capacidadMaxima, int cantAct) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantAct = cantAct;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantAct() {
        return cantAct;
    }

    public void setCantAct(int cantAct) {
        this.cantAct = cantAct;
    }

   public void llenarCafetera(){
       this.cantAct= this.capacidadMaxima;
     
   }

   public void servirTaza(int taza) {
       this.cantAct= this.cantAct - taza;
       if (cantAct>0) {
           System.out.println("La taza se lleno con extio");
       }else if (cantAct<0) {
           System.out.println("No se lleno la taza");
           System.out.println("La taza solo tiene "+(cantAct+taza)+" de cafe");
           this.cantAct=0;
       }
   }
   
   public void vaciarCafetera() {
       this.cantAct=0;
   }
   
   public void agregarCafe(int cafe) {
       if (cafe>this.capacidadMaxima) {
           System.out.println("Error se va a Desbordar la cafetera");
       } else if (cafe<this.capacidadMaxima) {
           this.cantAct= cantAct+cafe;
       }
       
   }
   
   public void consultar(){
       System.out.println(cantAct);
   }
   
   
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantAct=" + cantAct + '}';
    }
   
    
   
}
