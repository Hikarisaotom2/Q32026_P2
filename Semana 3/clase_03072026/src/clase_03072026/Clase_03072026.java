/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_03072026;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_03072026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        CRUD......
        
        1)Podemos crear clases 
        2) crear alumnos
        3)agregar alumnos a una clase. 
        4) asistencia de la clase 
        5) ver datos de clase 
        6)  datos del alumno 
         */
        Scanner entrada = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Clase> clases = new ArrayList<>();
        
        
        alumnos.add(new Alumno("12345", "Juan Perez", "Ciencia De Datos"));
        alumnos.add(new Alumno("12346", "Manuel Gomez", "Ciencia De Datos"));
        alumnos.add(new Alumno("56789", "Maria Hernandez", "Sistemas"));
        alumnos.add(new Alumno("56789", "Guadalupe Hernandez", "Sistemas"));
        
        
        clases.add(new Clase("P2",123,"1234","n/a","209/3"));
        
        //Matriculando estudiante de manera hardcoded
        clases.get(0).MatricularAlumno(alumnos.get(0));
        clases.get(0).MatricularAlumno(alumnos.get(1));
        
        while (true) {
            System.out.println("1)Podemos crear clases \n"
                    + "2) crear alumnos\n"
                    + "3)agregar alumnos a una clase. \n"
                    + "4) asistencia de la clase \n"
                    + "5) ver datos de clase \n"
                    + "6)  datos del alumno ");

            int op = entrada.nextInt();

            switch (op) {
                case 1 -> { //crera clases 
//                    Clase nuevaclase = crearClase();
//                    clases.add(nuevaclase);
                clases.add(crearClase());
                }

                case 2 -> { // crera alumno 
                    Alumno nuevoAlumno = crearAlumno();
                    alumnos.add(nuevoAlumno);
                }
                case 3 -> { // agregar alumnos a una clase. 
                    int posAlumno = seleciconarAlumno(alumnos);
                    int posClase = seleciconarClase(clases);

                    Alumno alumnoMatricular = alumnos.get(posAlumno);
                    Clase claseMatricular = clases.get(posClase);
                    claseMatricular.MatricularAlumno(alumnoMatricular);
                    System.out.println("Alumno Matriculado con Exito!");
                }
                case 4 -> {
                        int posClase= seleciconarClase(clases);
                      Clase asistencia = clases.get(posClase);
                       asistencia.listar();
                }
                case 5 -> {
                    int posClase = seleciconarClase(clases);
                   Clase actual = clases.get(posClase);
                    System.out.println(actual);
                }
                case 6 -> {
                    int posAlumno = seleciconarAlumno(alumnos);
                    Alumno alumnoDatos = alumnos.get(posAlumno);
                    System.out.println(alumnoDatos);
                }

                default -> {
                    System.out.println("Opcion no valida");
                }
            }// fin del switch 
            System.out.println("");
        }// fin dle while 
    }// fin del main 
    
        public static int seleciconarAlumno( ArrayList<Alumno> alumnos){
            System.out.println("ALUMNOS : ");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(i+" "+alumnos.get(i).getNombre());
            
        }
        System.out.println("Que alumno desea seleccionar: ");
          Scanner entrada = new Scanner(System.in);
          int pos = entrada.nextInt();
          return pos;
    }
        
    public static int seleciconarClase( ArrayList<Clase> clases){
        System.out.println("CLASES");
        for (int i = 0; i < clases.size(); i++) {
            System.out.println(i+" "+clases.get(i).getNombre());
            
        }
        System.out.println("Que clase desea seleccionar: ");
          Scanner entrada = new Scanner(System.in);
          int pos = entrada.nextInt();
          return pos;
    }
    
    
    public static Alumno crearAlumno() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la cuenta del alumno ");
        String cuenta = entrada.nextLine();
        System.out.println("Ingrese la carrera del alumno");
        String carrera = entrada.nextLine();

        Alumno nuevoAlumno = new Alumno(cuenta,nombre, carrera);
        return nuevoAlumno;
    }

    public static Clase crearClase() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la clase: ");
        String nombre = entrada.nextLine();
        System.out.println("Seccion");
        int seccion = entrada.nextInt();
        System.out.println("Dias en los que se imparte la clase: ");
        String dias = entrada.nextLine();
        System.out.println("Notas o comentarios: ");
        String notas = entrada.nextLine();
        System.out.println("Aula asignada: ");
        String aula = entrada.nextLine();
        Clase nuevaClase = new Clase(nombre, seccion, dias, notas, aula);
        return nuevaClase;

    }

}
