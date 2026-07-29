/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_27072026;

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
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el nombre");
        String nombre = entrada.nextLine();
     Persona edwin = new Persona(nombre, 20, 172);
        System.out.println("La informacion de edwin");
        
        System.out.println("Usando to string automatico");
        System.out.println(edwin);
         System.out.println("Llamando to string");
        System.out.println(edwin.toString());
             
    
        

    
    }
    
    void saludar(){
        
    }
    
    void saludar(int x){
        
    }
    
    
      void saludar(String valor2, int x){
        
    }
      
            void saludar(int x, String valor2){
        
    }
}
