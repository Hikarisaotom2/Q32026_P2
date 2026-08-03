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

    public Persona(int edad, String nombre, double estatura) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
    }

     // NO SE PUEDE MODIFICAR SU NOMBRE NI PARAMETROS........
    // getters y setters
    // getter: es un metodo que me ayuda a obtener el valor de una variable  // me ayuda a la lectura
    // setter: es un metodo que me ayuda a actualizar el valor de una variable. // me ayuda a la escritura

    public int getEdad() {
      
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre;
    }
    
}
