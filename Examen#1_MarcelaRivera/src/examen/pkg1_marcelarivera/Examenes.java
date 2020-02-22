/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_marcelarivera;

import java.util.Random;

/**
 *
 * @author Mvrivera
 */
public class Examenes {
    private String materia,tema;
    private int valor,requerido;
    private int puntaje;
    Random r=new Random();
    
    public Examenes() {
    }

    public Examenes(String materia, String tema, int valor) {
        this.materia = materia;
        this.tema = tema;
        this.valor = valor;
        this.requerido = 1+r.nextInt(99);;
    }

    public Examenes(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getRequerido() {
        return requerido;
    }

    public void setRequerido(int requerido) {
        this.requerido = requerido;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Examenes{" + "materia=" + materia + ", tema=" + tema + ", valor=" + valor + ", requerido=" + requerido + ", puntaje=" + puntaje + ", r=" + r + '}';
    }
    
    
    
}
