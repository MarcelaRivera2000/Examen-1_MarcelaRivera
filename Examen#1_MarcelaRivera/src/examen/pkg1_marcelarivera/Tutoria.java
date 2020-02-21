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
public class Tutoria {
    private int hora,aula,dia,mes,año;
    private String clase,tema;
    private Tutor tutor;
    private ArrayList<Alumno_normal> alumnos=new ArrayList();

    public Tutoria() {
    }

    
    public Tutoria(int hora, int aula, int dia, int mes, int año, String clase, String tema, Tutor tutor) {
        this.hora = hora;
        this.aula = aula;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.clase = clase;
        this.tema = tema;
        this.tutor = tutor;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public ArrayList<Alumno_normal> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno_normal> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Tutoria{" + "hora=" + hora + ", aula=" + aula + ", dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + ", clase=" + clase + ", tema=" + tema + ", tutor=" + tutor + ", alumnos=" + alumnos + '}';
    }
    
    
}
