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
public class Alumno_normal extends Alumno{
    private int conocimiento,n_aprendizaje;
    private ArrayList examenes=new ArrayList();

    public Alumno_normal() {
    }

    public Alumno_normal(int n_aprendizaje, String nombre, String carrera, String lugarNacimiento, String usuario, String contra, int edad, int n_cuenta) {
        super();
        this.conocimiento = setConocimiento(conocimiento);
        this.n_aprendizaje = n_aprendizaje;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public int setConocimiento(int conocimiento) {
        conocimiento+=this.conocimiento ;
        return conocimiento;
        
    }

    public int getN_aprendizaje() {
        return n_aprendizaje;
    }

    public void setN_aprendizaje(int n_aprendizaje) {
        this.n_aprendizaje = n_aprendizaje;
    }

    public ArrayList getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList examenes) {
        this.examenes = examenes;
    }

    @Override
    public String toString() {
        return "Alumno_normal{" + "conocimiento=" + conocimiento + ", n_aprendizaje=" + n_aprendizaje + ", examenes=" + examenes + '}';
    }

  
    
    
    
}