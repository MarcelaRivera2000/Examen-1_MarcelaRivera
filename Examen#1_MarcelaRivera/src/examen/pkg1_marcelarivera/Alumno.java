/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_marcelarivera;

/**
 *
 * @author Mvrivera
 */
public class Alumno {
    private String nombre,carrera,lugarNacimiento,usuario,contra;
    private int edad,n_cuenta;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, String carrera, String lugarNacimiento, int n_cuenta, String usuario, String contra) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.lugarNacimiento = lugarNacimiento;
        this.usuario = usuario;
        this.contra = contra;
        this.edad = edad;
        this.n_cuenta = n_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", carrera=" + carrera + ", lugarNacimiento=" + lugarNacimiento + ", usuario=" + usuario + ", contra=" + contra + ", edad=" + edad + ", n_cuenta=" + n_cuenta + '}';
    }
    
    
    
}
