/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_13082026;

/**
 *
 * @author claudiacortes
 */
public class JefeCarrera extends Docente {
    private double sueldo;
    private double bono;

    public JefeCarrera(double sueldo, double bono, String nombre, String correo, String id, String talentoHumano) {
        super(nombre, correo, id, talentoHumano);
        this.sueldo = sueldo;
        this.bono = bono;
    }
    
    
        @Override
    public void generarComprobante(){
        System.out.println("JEFE DE CARRERA:");
        System.out.println(" sueldo base: "+this.sueldo);
            System.out.println("Bono: "+this.bono);
        System.out.println("Deducciones: ");
        double isr = this.sueldo*0.15;
        System.out.println("ISR: "+ isr);
        System.out.println("RAP: 600");
        System.out.println("IHSS: 700");
        double deducciones = isr+600+700;
        System.out.println("TOTAL DEDUCCIONES: "+deducciones);
        System.out.println("SALARIO NETO: " + ((this.sueldo+this.bono)- deducciones));
        
    }
    
    
}
