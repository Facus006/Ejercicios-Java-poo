/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

/**
 *
 * @author Facu
 */
public class ecuacion {
    private double num1;
    private double num2;
    public double mayor;
    public double menor;
    public ecuacion() {
    }

    public void ecuacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void encontrarMayor() {
        
        if (this.num1>this.num2) {
            mayor=num1;
            menor = num2;
        } else  {
            mayor = num2;
            menor= num1;
        }
        
        System.out.println(mayor);
    }

    public void potencia(){
        double redondeadoMayor= Math.round(mayor*100.0)/100.0;
         double redondeadoMenor= Math.round(menor*100.0)/100.0;
         double potencia = Math.pow(redondeadoMayor, redondeadoMenor);
         potencia= Math.round(potencia*100.0)/100.0;
         
         System.out.println(redondeadoMayor+" elevado a "+redondeadoMenor+" es "
         + potencia);
    }
    
    public void raiz(){
        int newmenor= (int) menor;
        double resultado = (double) Math.sqrt(newmenor);
        System.out.println("La raiz cuadrada de "+newmenor+" es "+resultado);
        
    }
    
    
    @Override
    public String toString() {
        return "ecuacion{" + "num1=" + num1 + ", num2=" + num2 + ", mayor=" + mayor + ", menor=" + menor + '}';
    }
  
}
