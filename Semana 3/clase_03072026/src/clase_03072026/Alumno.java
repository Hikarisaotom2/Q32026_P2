/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_03072026;

/**
 *
 * @author claudiacortes
 */
public class Alumno {
    String cuenta;
    String nombre;
    String carrera;
    int asistencias;

    public Alumno() {
    }

    public Alumno(String cuenta, String nombre, String carrera) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
        this.asistencias = 0;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
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

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias() {
        asistencias++;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + " \n Cuenta:  "+cuenta+ " \n Carrera: " +carrera + " \n Asistencias: " + asistencias;
    }
    
    
    
}
