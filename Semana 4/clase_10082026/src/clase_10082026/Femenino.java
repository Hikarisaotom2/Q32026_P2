/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_10082026;

/**
 *
 * @author claudiacortes
 */

/*
Para establacer un lazo de herencia,
se utiliza la palabra reservada extends seguida del nombre de la clase de la que queremos heredar 
*/

public class Femenino extends Paciente {
    private String fechaUltimoPeriodo;
    private boolean embarazo;  
    int prueba; 
    public Femenino(String fechaUltimoPeriodo,boolean embarazo,String nombre, int eda, double altura, double peso, String tipoSangre){
        super(nombre,eda,altura,peso,tipoSangre);
        this.embarazo = embarazo;
        this.fechaUltimoPeriodo = fechaUltimoPeriodo;
    }
    
}
