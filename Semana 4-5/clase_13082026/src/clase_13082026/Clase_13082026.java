/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_13082026;

/**
 *
 * @author claudiacortes
 */
public class Clase_13082026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        POLIMORFISMO:
            hacer que un metodo se comporte diferente dependiendo de la situacion 
                NOTA IMPORTANTE: No es exclusivo ni depende de la herencia..... 
                -> Polimorfismo por sobreescritura simple -> trabaja con herencia 
                    -> el metodo polimorfico debe estar creado en el padre. 
                    -> el polimorfismo se configura en En los hijos: 
                        -> NO PODEMOS MODIFICAR LA DEFINICION DEL METODO QUE ESTA DADA EN EL PADRE
                        -> Es el mas flexible.Los hijos no estan obligados a sobre escribir. 
                -> Polimorfismo por clases abstractas  -> Trabaja con herencia 
                -> Polimorfismo por uso de interfaces.  -> Trabaja con interfaces -> abstraccion 
        
        */
        
        
        /*
        SISTEMA RRHH para unitec 
        
        Docente: 
            -> nombre 
            -> ID
            -> TH 
            -> correo 
         -> Permanentes:  
            * sueldo 
            -> salario fijo 
            -> ISR , RAP , IHSS
        - > Por hora catedra : 
            * num clases 
            * pago por clase 
            ->Sueldo por clase * cantidad clases 
            -> RAP , IHSS
        -> Jefe de carrera: 
            * sueldo 
            * bono 
            -> sueldo fijo + bonos 
             -> ISR , RAP , IHSS
        
        
        -> Comprobantes 
        
        */
        
        //double sueldo, double bono, String nombre, String correo, String id, String talentoHumano
        
        Docente Bocanegra = new JefeCarrera(45000,5000,"Reynod Bocanegra", "reynod.bocanegra@unitec.edu","080119751234","123");
        //double sueldoClase, int cantClases, String nombre, String correo, String id, String talentoHumano
        Docente Cortes = new  DocenteHoraCatedra(7000,2,"Claudia Cortes", "clau_cortes@unitec.edu","080119990123","124");
        //double sueldo, String nombre, String correo, String id, String talentoHumano
        Docente Medina = new Permanente(30000,"Geovanny Medina", "geovany@unitec.edu","08011970123","125");
        
        
        Bocanegra.generarComprobante();
        System.out.println("");
        Cortes.generarComprobante();
        System.out.println("");
        Medina.generarComprobante();
    }
    
}
