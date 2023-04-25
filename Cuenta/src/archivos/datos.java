/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class datos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numcuenta;
    private int documento;
    private double saldo;
    

    public datos() {
    }

    public void  newCuenta() {
        System.out.println("Ingrese un numero para su nueva cuenta:");
        int numcuenta2 = leer.nextInt();
        this.numcuenta = numcuenta2;
        System.out.println("Ingrese su documento; ");
        int documento2 = leer.nextInt();
        this.documento = documento2;
        System.out.println("Su cuenta tiene 0 pesos, ingrese el dinero que "
                + "desea introducir");
        int saldo2 = leer.nextInt();
        this.saldo = saldo2;

    }

    public void edatos(int numcuenta, int documento, double saldo) {
        this.numcuenta = numcuenta;
        this.documento = documento;
        this.saldo = saldo;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double ingreso) {
        this.saldo = saldo + ingreso;

    }

    public void retirar(double retirar) {
        if (retirar > this.saldo) {
            System.out.println("No tiene suficientes fondos");
        } else {
            this.saldo = saldo - retirar;
        }

    }

    public void retirorapido() {
        System.out.println("Esta seguro que quiere retirar el 20% de su saldo? Si/No");
        String resp = leer.next();
        if (resp.toLowerCase().equals("si")) {
            this.saldo = saldo * 0.8;
        } else {
            System.out.println("ok, su saldo es de " + this.saldo);
        }

    }

    public void consultarsaldo() {
        System.out.println("Su saldo es de " + this.saldo);
    }

    public void consultardatos() {
        System.out.println("Su numero de cuenta es " + this.numcuenta);
        System.out.println("Su DNI es " + this.documento);
        System.out.println("Su saldo es " + this.saldo);

    }

}
