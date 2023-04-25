/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec;

/**
 *
 * @author Facu
 */
public class rectangulo {
    private int altura;
    private int base;
    public  int superficie;
    public int perimetro;
    
    public rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
  
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public int superficie() {
        superficie=base*altura;
     return superficie;
    }
    public int perimetro () {
        perimetro=(base+altura)*2;
        return perimetro;
    }

    public void construir(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    @Override
    public String toString() {
        return "rectangulo{" + "altura=" + altura + ", base=" + base + ", superficie=" + superficie + ", perimetro=" + perimetro + '}';
    }
   
    
}
