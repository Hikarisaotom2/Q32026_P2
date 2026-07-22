/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication186;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class JavaApplication186 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*

        Arreglos / ArrayList 
        
        Arreglos: 
        1) tamaño fijo
        
        Arraylist:
        1) tamaño dinamico 
        Matrices 
        
        Recursion
            -> Metodos 
        
        */
        
        /*
            Tipo de dato nombreVariable = valor;
        
        */
        int [] numeros = new int[4];
        int [] numero2 = {1,2,3,4,5,6};
        
        System.out.println(numeros[0]);
        
        numeros[1] = 79;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        ArrayList<String> nombres = new ArrayList<String>();//0
        nombres.add("hola");
        nombres.remove(0);
        
        System.out.println(nombres);
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        
        /*
        Edad de una persona 
        camelCase -> edadPersona,
        Pascal Case -> EdadPersona,
        kebab case-> edad-persona,
        snake_case -> edad_persona 
        
        
        harcoded //en duro 
        String villanos = {"Claudia","Diego","Joana","Arnold"};
        
        */
        
    }// fin del main
    
}// fin de la clase
