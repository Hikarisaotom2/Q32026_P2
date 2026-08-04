/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_03072026;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase {
    
    // atributos
    String nombre;
    int seccion;
    String dias;
    String notas;
    String aula;
    ArrayList<Alumno> alumnos ;

    public Clase(String nombre, int seccion, String dias, String notas, String aula) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.dias = dias;
        this.notas = notas;
        this.aula = aula;
        this.alumnos = new ArrayList<>();
    }
    
    

    // metodos 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Clase{" + "nombre=" + nombre + ", seccion=" + seccion + ", dias=" + dias + ", notas=" + notas + ", aula=" + aula + ", alumnos=" + alumnos + '}';
    }
    
    
    
    
}
