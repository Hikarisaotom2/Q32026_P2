/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_10082026;

/**
 *
 * @author claudiacortes
 */
public class Masculino extends Paciente {
    private String ultimaRevision;

    public Masculino(String ultimaRevision, String nombre, int eda, double altura, double peso, String tipoSangre) {
        super(nombre, eda, altura, peso, tipoSangre);
        this.ultimaRevision = ultimaRevision;
    }
    
    
}
