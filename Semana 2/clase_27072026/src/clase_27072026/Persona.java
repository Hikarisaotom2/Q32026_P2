package clase_27072026;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author claudiacortes
 */
public class Persona {
    //Propiedades/ atributos 
    public int edad;
    private String nombre;
    public double estatura;

    /*
  Controles de acceso. 
    -> Publico -> public :cualquier parte dle programa puede acceder a ello
    Nota: cuando no se agrega ningun control de acceos a una variuable, por defecto java asigna el valor public 
    -> Privado  -> private : Solamente la clase tiene acceso a ese valor 
    -> 
    
    */
    
    
    //Metodos   - > ayudan a representar las acciones  
        // Constructor 
    // 1) no tiene tipo de retorno 
    // 2) debe llamarse igual que la clase 
     Persona(){
      
    } 
    
    Persona(String nombre, int edad, double estatura){
        // this 
        this.edad = edad;
        this.nombre = nombre;
        this.estatura= estatura;
    } // fin del constructor 
    
    
    
    // NO SE PUEDE MODIFICAR SU NOMBRE NI PARAMETROS........
    
    
    // getters y setters 
    // getter: es un metodo que me ayuda a obtener el valor de una variable  // me ayuda a la lectura 
    public String verNombre(){
        return nombre;
    }
    // setter: es un metodo que me ayuda a actualizar el valor de una variable. // me ayuda a la escritura 
    public void actualizarNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
      
        return "Nombre: "+this.nombre;
    }
    
}
