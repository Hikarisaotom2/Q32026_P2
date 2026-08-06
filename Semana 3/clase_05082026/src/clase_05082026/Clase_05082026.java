/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_05082026;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_05082026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1 - > Try Catch: 
        IMPORTANTE: Esto no sustituye a las validaciones
        2 -> Enums:
        Ayudan a representar un conjunto de valores o datos conocidos y finitos. 
        -> IMPORTANTE: se parecen a las clases, pero no son lo mismo; 
        
        */
        
        
        try {
            // el codigo que quwremos ejecutar y que tiene una posibilidad de causar una exception 
            Scanner entrada = new Scanner(System.in);
           
            System.out.println("Ingrese un dia ");
            String dia = entrada.nextLine();
            Dias diaLectura = Dias.valueOf(dia.toUpperCase());
            
            System.out.println("El nombre del dia es: "+ diaLectura);
            System.out.println("El simbolo del dia es: "+ diaLectura.getVersionCorta());
            System.out.println("El orden en la semana del dia es: "+diaLectura.getOrdenSemana());
             
//        }catch(InputMismatchException error){
           
        }catch(Exception error1){
            System.out.println("Dia invalido");
        }// fin dle catch 
        
        System.out.println("ESTO ESTA FUERA DEL TRY CATCH ");
    }
    
}
