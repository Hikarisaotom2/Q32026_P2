/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_13082026;

/**
 *
 * @author claudiacortes
 */
public class Docente {
    protected String nombre;
    protected String correo;
    protected String id;
    protected String talentoHumano;

    public Docente(String nombre, String correo, String id, String talentoHumano) {
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.talentoHumano = talentoHumano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTalentoHumano() {
        return talentoHumano;
    }

    public void setTalentoHumano(String talentoHumano) {
        this.talentoHumano = talentoHumano;
    }
    
    public void generarComprobante(){
        
        
    }
    
    public void calcularSueldo(){
        
    }
    
    
}
