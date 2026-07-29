/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase22072026;

/**
 *
 * @author claudiacortes
 */
public class Clase22072026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Matrices
//        String [] nombres = new String[2];
//        String [][] matrizNombres = new String[2][3];
//        String [][][] parqueo = new String[2][3][2];
//        
//        nombres[0] = "hola";
//        System.out.println(nombres[0]);
////        
//        matrizNombres[0][0] = "Claudia";
//        System.out.println(matrizNombres[0][0]);
//        
//        parqueo[0][0][0]="Mazda";
//        System.out.println(parqueo[0][1][2]);
//        
//        int tamanoFilas = matrizNombres.length;
//        int tamnoColumnas = matrizNombres[0].length;
//        
//        for (int i = 0; i < matrizNombres.length; i++) {// filas 
//            for (int j = 0; j < matrizNombres[i].length; j++) {//columnas 
//                System.out.println(matrizNombres[i][j]);
//            }// fin del for 
//        }// fin del for 
//        
//        
//        for (int i = 0; i < parqueo.length; i++) {// nivel 
//            for (int j = 0; j < parqueo[i].length; j++) {//fila 
//                for (int k = 0; k < parqueo[i][j].length; k++) {//columna
//                    System.out.println(parqueo[i][j][k]);
//                }
//            }// fin del for 
//        }// fin del for
        
//        System.out.println("CONTADOR A 10 CON FOR ");
//        for (int i = 0; i <= 10; i++) {
//            int x = 0;
//            int var=0;
//            System.out.println(i);
//          
//        }
        
        // cuando se detiene? i>10 
        
        System.out.println("contador a 10 con recursion");
        contar10(0);
        
    }
    
    
    
    /*
    
    1 repetir 
    2 pare 
    3 llamar el meodo dentro de si mismo
    */
    
    public static void contar10(int i){
        
        // Caso Base -> detiene el ciclo 
        // Caso Recursivo  -> sigure repitiendo -> hacer el llamado recursivo 

        if(i>10){ // caso base 
            
        }else{// caso recursivo 
            System.out.println(i);
                i=i+1;
//            i+=1;
//            i++;
            contar10(i); // crea la recusion 
        }
        
    }// fin del metodo 
    
}
