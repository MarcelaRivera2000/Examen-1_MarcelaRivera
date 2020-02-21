/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_marcelarivera;

import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class Tutor extends Alumno{

   private ArrayList<String> clasesDadas=new ArrayList();
   private double ganacia;
   private int n_enseña,n_tutoriasDadas=0;
    
    public Tutor() {
    }

    public Tutor(double ganacia, int n_enseña, String nombre, String carrera, String lugarNacimiento, String usuario, String contra, int edad, int n_cuenta) {
        super(nombre, edad, carrera, lugarNacimiento, n_cuenta, usuario, contra);
        this.ganacia = ganacia;
        this.n_enseña = n_enseña;
    }

    public ArrayList<String> getClasesDadas() {
        return clasesDadas;
    }

    public void setClasesDadas(ArrayList<String> clasesDadas) {
        this.clasesDadas = clasesDadas;
    }

    public double getGanacia() {
        return ganacia;
    }

    public void setGanacia(double ganacia) {
        this.ganacia = ganacia;
    }

    public int getN_enseña() {
        return n_enseña;
    }

    public void setN_enseña(int n_enseña) {
        this.n_enseña = n_enseña;
    }

    public int getN_tutoriasDadas() {
        return n_tutoriasDadas;
    }

    public void setN_tutoriasDadas(int n_tutoriasDadas) {
        this.n_tutoriasDadas = n_tutoriasDadas;
    }

    @Override
    public String toString() {
        return "Tutor{" + "clasesDadas=" + clasesDadas + ", ganacia=" + ganacia + ", n_ense\u00f1a=" + n_enseña + ", n_tutoriasDadas=" + n_tutoriasDadas + '}';
    }
    
    
    
    
}
