/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_13082026;

/**
 *
 * @author claudiacortes
 */
public class DocenteHoraCatedra extends Docente{
    
    private double sueldoClase;
    private int cantClases;

    public DocenteHoraCatedra(double sueldoClase, int cantClases, String nombre, String correo, String id, String talentoHumano) {
        super(nombre, correo, id, talentoHumano);
        this.sueldoClase = sueldoClase;
        this.cantClases = cantClases;
    }

 @Override 
 public void generarComprobante(){
     System.out.println("DOCENTE POR HORA ");
     System.out.println("Cantidad clases: "+this.cantClases);
     System.out.println("Sueldo por clase: "+this.sueldoClase);
     System.out.println("DEDUCCIONES: ");
     System.out.println("RAP: 600");
     System.out.println("IHSS: 700");
    double deducciones = 600+700;
    System.out.println("TOTAL DEDUCCIONES: "+deducciones);
     System.out.println("SALARIO NETO "+ ((this.cantClases*this.sueldoClase)-deducciones));
        
        
    }
    
    public void calcularSueldo(){
        
    }
    
    
}
