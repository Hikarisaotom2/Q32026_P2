/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clase_05082026;

/**
 *
 * @author claudiacortes
 */

/*
Se parece a las clases PERO NO SON LO MISMO
*/
public enum Dias {
     MARTES("M",2),
    LUNES("L",1), 
    JUEVES("J",4), 
    MIERCOLES("X",3), 
    VIERNES("V",5);
    
    String versionCorta;
    int ordenSemana;
    
    private Dias(String versionCorta, int ordenSemana ){
        this.ordenSemana = ordenSemana;
        this.versionCorta=versionCorta;
    }
    
    String getVersionCorta(){
        return versionCorta;
    }
    
    
    int getOrdenSemana(){
        return ordenSemana;
    }
    
    
}

