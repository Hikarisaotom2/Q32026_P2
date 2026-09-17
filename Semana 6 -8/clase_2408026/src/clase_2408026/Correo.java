/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_2408026;

/**
 *
 * @author claudiacortes
 */
public class Correo {
    private String destinatario;
    private String mensaje;

    public Correo(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    


    @Override
    public String toString() {
             return "destinatario: " + destinatario + "\nmensaje=" + mensaje + '}';
       
    }
    
    
    
    
    
}
