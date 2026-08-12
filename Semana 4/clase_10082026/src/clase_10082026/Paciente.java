/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_10082026;

/**
 *
 * @author claudiacortes
 */
public class Paciente {
    /*
    -> Public: 
        Todos tienen acceso 
     -> Private: 
        Solamente la clase tiene acceso a esa informacion 
     -> Protected: 
            solamente la clase y sus hijos tiene acceso a la informacion 
    */
    
       protected String nombre;
       protected int eda;
       protected double altura;
       protected  double peso;
       protected String tipoSangre;

    public Paciente(String nombre, int eda, double altura, double peso, String tipoSangre) {
        this.nombre = nombre;
        this.eda = eda;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEda() {
        return eda;
    }

    public void setEda(int eda) {
        this.eda = eda;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    
}
