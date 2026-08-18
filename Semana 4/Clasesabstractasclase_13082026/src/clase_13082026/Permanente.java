/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_13082026;

/**
 *
 * @author claudiacortes
 */
public class Permanente extends Docente{
    private double sueldo;

    public Permanente(double sueldo, String nombre, String correo, String id, String talentoHumano) {
        super(nombre, correo, id, talentoHumano);
        this.sueldo = sueldo;
    }
    
    
    @Override
    public void generarComprobante(){
        System.out.println("DOCENTE PERMANENTE:");
        System.out.println(" sueldo base: "+this.sueldo);
        System.out.println("Deducciones: ");
        double isr = this.sueldo*0.15;
        System.out.println("ISR: "+ isr);
        System.out.println("RAP: 600");
        System.out.println("IHSS: 700");
        double deducciones = isr+600+700;
        System.out.println("TOTAL DEDUCCIONES: "+deducciones);
        System.out.println("SALARIO NETO: " + (this.sueldo- deducciones));
        
    }
    
    public void calcularSueldo(){
        
    }
    
}
