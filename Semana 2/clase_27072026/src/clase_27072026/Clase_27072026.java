/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_27072026;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_27072026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    Persona claudia = new Persona();
//        claudia.nombre="Claudia";
//        claudia.edad=89;
//        claudia.estatura=170;
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("ingrese el nombre");
//        String nombre = entrada.nextLine();
//     Persona edwin = new Persona(nombre, 20, 172);
//      Persona carlos = edwin ;
//      
//      edwin.actualizarNombre("Josue");
//      
//      
//        System.out.println(edwin.verNombre());
//        System.out.println(carlos.verNombre());
  
        
//        System.out.println("La informacion de edwin");
        
//        System.out.println("Usando to string automatico");
//        System.out.println(edwin);
//         System.out.println("Llamando to string");
//        System.out.println(edwin.toString());
             
    

    /*crud

    -> crear personas 
    -> listar personas
    -> buscar personas
    -> eliminar personas 
    -> actualizar personas*/
    
    ArrayList <Persona> personas = new ArrayList <Persona>();
  
//    personas.add(crearPersona());

    
//    Persona resultado = crearPersona();
//    personas.add(resultado);
        

   personas.add(new Persona(20,"Carlos",185));
   personas.add(new Persona(18,"Daniela",155));
   personas.add(new Persona(18,"Isvetny",170));
   imprimirPersonas(personas);
   
    }
    
    
    public static void imprimirPersonas(ArrayList <Persona> personas){
        
//        for (int i = 0; i < personas.size(); i++) {
//            Persona persona = personas.get(i);
//        }
        
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
    }
    
    public static void buscarPersonas(ArrayList <Persona> personas, String nombre){
        
        for (int i = 0; i <personas.size(); i++) {
            
            if(nombre.equalsIgnoreCase( personas.get(i).getNombre())){
//        if (personas.contains(new Persona(0,nombre,170))) { no funciona por el hascode de cada objeto 
                System.out.println("Se encontro el objeto");
                break;
                
            }
            
        }
    }
    public static  Persona crearPersona(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre de la persona");
        String nombre = entrada.nextLine();
        System.out.println("ingrese la edad: ");
        int edad = entrada.nextInt();
        System.out.println("Ibgrese la estatura");
        double estatura = entrada.nextDouble();
        
        Persona nuevaPersona = new Persona(edad,nombre,estatura);
        return new Persona(edad,nombre,estatura);
//        return nuevaPersona;
    }
    
   
}
