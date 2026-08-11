/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_10082026;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_10082026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
        Herencia: 
        
        Tipos y subtipos de datos. 
        
        -> Padre/ super clase: es el tipo de dato generico, 
        -> Hijos: son los subtipos de datos
        
        Reglas de la herencia: 
         1) El padre no sabe quienes son sus hijos 
         2) El hijo es quien dice quien es su padre (Nota: los hijos no saben quienes son sus "hermanos") 
            2.1 ) el hijo puede usar la mayoria de cosas que tiene el padre 
            2.2 ) El hijo se puede considerar de dos tipos de dato valido (su propio tipo de dato y eldel padre). 
            2.3 ) el hijo debe serguir la sreglas o estructura del padre. 
            2.4 ) cada objeto se conoce a si mismo 
        
                       Paciente 
                  -> Nombre, edad, altura, peso, tipo sangre... 
            Femenino                                         Masculino 
            -> fecha del ultimo periodo menstrual.          fecha ultima revision prostata 
            -> embarazo 
           ......
        */
      
      
      
      Femenino claudia = new Femenino("31/8/2026", false, "Claudia",90,1.70,180.0,"O+");
      Masculino carlos = new Masculino("31/8/2060","Carlos",18,1.70,160,"O+");
     
      Paciente p1 = new Femenino("31/8/2026", false, "Claudia",90,1.70,180.0,"O+");
      Paciente p2 = new Masculino("31/8/2060","Carlos",18,1.70,160,"O+");
      Paciente p3 = new Paciente("Carlos",18,1.70,160,"O+");
      
      
      ArrayList<Paciente> pacientes = new ArrayList<>();
      
      pacientes.add(claudia);
      pacientes.add(carlos);
      pacientes.add(p1);
      pacientes.add(p3);
      pacientes.add(p2);
      
      
      
      
      
      
    }
    
}
