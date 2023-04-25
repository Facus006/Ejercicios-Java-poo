/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Alumnos {
    private String nombreCurso;
    private int HSxDia;
    private int DiasxSem;
    private String turno;
    private int precioxhs;
    private String [] Alumnos = new String [5];
    private int cont=0;
    public Alumnos() {
    }

    public Alumnos(String nombreCurso, int HSxDia, int DiasxSem, String turno, int precioxhs, String[] Alumnos) {
        this.nombreCurso = nombreCurso;
        this.HSxDia = HSxDia;
        this.DiasxSem = DiasxSem;
        this.turno = turno;
        this.precioxhs = precioxhs;
        this.Alumnos = Alumnos;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    
    
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHSxDia() {
        return HSxDia;
    }

    public void setHSxDia(int HSxDia) {
        this.HSxDia = HSxDia;
    }

    public int getDiasxSem() {
        return DiasxSem;
    }

    public void setDiasxSem(int DiasxSem) {
        this.DiasxSem = DiasxSem;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioxhs() {
        return precioxhs;
    }

    public void setPrecioxhs(int precioxhs) {
        this.precioxhs = precioxhs;
    }

    public String[] getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(String[] Alumnos) {
        this.Alumnos [5] = Alumnos [5];
    }

    public void cargarAlumnos() {
      Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
      for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno "+(i+1));
            Alumnos[i]= leer.next();
              if (Alumnos [i].toLowerCase().equals("ausente")) {
                this.Alumnos [i] = "AUSENTE";
            }
          this.cont ++;    
        }
        System.out.println(Arrays.toString(Alumnos));
    }

    
    public void crearCurso() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del curso: ");
        this.nombreCurso = leer.next();
        System.out.println("Ingrese la cantidad de Horas que dura la cursada: ");
        this.HSxDia = leer.nextInt();
        System.out.println("Ingrese cuantos dias a la semana hay cursada: ");
        this.DiasxSem = leer.nextInt();
        System.out.println("Ingrese si es turno tarde o turno mañana: ");
        this.turno = leer.next();
        System.out.println("Ingrese el precio por hora");
        this.precioxhs = leer.nextInt();
        cargarAlumnos();
        
    }
    
    
    public void calcularGanancia() {
        System.out.println(cont);
        int ganancia = HSxDia * precioxhs * cont * DiasxSem ;
        System.out.println("La ganancia semanal es de "+ganancia+"$");
        
    }
    
}
