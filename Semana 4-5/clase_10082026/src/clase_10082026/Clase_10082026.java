/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_10082026;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_10082026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Herencia: 
        
        Tipos y subtipos de datos. 
        
        -> Padre/ super clase: es el tipo de dato generico, 
        -> Hijos: son los subtipos de datos
        
        Reglas de la herencia: 
         1) El padre no sabe quienes son sus hijos 
         2) El hijo es quien dice quien es su padre (Nota: los hijos no saben quienes son sus "hermanos") 
            2.1 ) el hijo puede usar la mayoria de cosas que tiene el padre 
            2.2 ) El hijo se puede considerar de dos tipos de dato valido (su propio tipo de dato y eldel padre). 
            2.3 ) el hijo debe serguir la sreglas o estructura del padre. 
            2.4 ) cada objeto se conoce a si mismo 
        
                       Paciente 
                  -> Nombre, edad, altura, peso, tipo sangre... 
            Femenino                                         Masculino 
            -> fecha del ultimo periodo menstrual.          fecha ultima revision prostata 
            -> embarazo 
           ......
         */

        ArrayList<Paciente> pacientes = new ArrayList<>();

        Femenino claudia = new Femenino("15/8/2026", false, "Claudia", 90, 1.70, 180.0, "O+");
        Masculino carlos = new Masculino("31/8/2060", "Carlos", 18, 1.70, 160, "O+");

        Paciente p1 = new Femenino("18/8/2026", false, "Claudia", 90, 1.70, 180.0, "O+");
        Paciente p2 = new Masculino("20/8/2060", "Carlos", 18, 1.70, 160, "O+");
        Paciente p3 = new Paciente("Carlos", 18, 1.70, 160, "O+");
        pacientes.add(claudia);
        pacientes.add(carlos);
        pacientes.add(p1);
        pacientes.add(p3);
        pacientes.add(p2);

        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("1 crear pacientes \n"
                    + "2 modificar pacientes\n"
                    + "3 eliminar pacientes \n"
                    + "4 listar"
            );
            int op = entrada.nextInt();
            switch (op) {
                case 1 -> {
                    Paciente nuevoPaciente = crearPacaciente();
                    pacientes.add(nuevoPaciente);

//                    pacientes.add(crearPacaciente()); operacion equivalente 
                }
                case 2 -> {
                    //Modificar 
                    modificarPaciente(pacientes);

                }
                case 3 -> {
                }
                case 4 -> {
                    System.out.println("Desea listar \n"
                            + "1 Todos los pacientes \n"
                            + "2 Mujeres \n"
                            + "3 Hombres \n");
                    int opListar = entrada.nextInt();
                    switch (opListar) {
                        case 1 -> {
                            listarPacientes(pacientes);
                        }
                        case 2 -> {
                            listarFemenino(pacientes);
                        }
                        case 3 -> {
                            listarMasculino(pacientes);
                        }
                        default -> {
                            System.out.println("Opcion invalida");
                        }
                    }
                }

                default -> {
                    break;
                }
            }

        }
        // 1 )  Tercer control de acceso: Private, public, ...... 
        // 2 ) Identificar tipo de objeto. 

        /*
      CRUD 
       -> crear 
        -> femeninos 
        -> maculinos 
      -> modificar
        -> se debe identificar el tipo de paciente para saber que atributos se modifican 
      -> eliminar 
      -> listar 
        -> todos los pacientes 
        -> pacientes masculinos 
        -> pacientes femeninos 
         */
    }

    public static void modificarPaciente(ArrayList<Paciente> pacientes) {
        listarPacientes(pacientes);
        System.out.println("Ingrese la pos del paciente que desea modificar");
        Scanner entrada = new Scanner(System.in);
        int pos = entrada.nextInt();

        Paciente pacienteModificar = pacientes.get(pos);

        if (pacienteModificar instanceof Masculino) {// objeto del tipo masculino
            //Casteo: conversion explicita de datos
            //(Tipo de dato al que queremos convertir) Variable que tiene el tipo de dato a convertir
            Masculino pacienteMasculino = (Masculino) pacienteModificar;
            System.out.println("Cual es la fecha de la ultima revision:  ");
            String nuevaFecha = entrada.nextLine();
            pacienteMasculino.setUltimaRevision(nuevaFecha);

        } else if (pacienteModificar instanceof Femenino) {// objeto del tipo femenino

            Femenino pacienteFemenino = (Femenino) pacienteModificar;
            System.out.println("Fecha ultimo periodo");
             entrada.nextLine();
            String fechaUltimoPeriodo = entrada.nextLine();
            System.out.println("Embarazo? 1. si 2.No");
            int op = entrada.nextInt();
            boolean embarazo = op == 1;
            pacienteFemenino.setFechaUltimoPeriodo(fechaUltimoPeriodo);
            pacienteFemenino.setEmbarazo(embarazo);

        } else {// objeto del tipo paciente 

        }

    }

    public static void listarFemenino(ArrayList<Paciente> pacientes) {
        for (int i = 0; i < pacientes.size(); i++) {
            Paciente paciente = pacientes.get(i);
            if (paciente instanceof Femenino) {
                System.out.println(i + ") " + paciente.nombre + ((Femenino) paciente).getFechaUltimoPeriodo());

            }
        }
    }

    public static void listarMasculino(ArrayList<Paciente> pacientes) {
        for (int i = 0; i < pacientes.size(); i++) {
            Paciente paciente = pacientes.get(i);
            if (paciente instanceof Masculino) {
                System.out.println(i + ") " + paciente.nombre);

            }
        }
    }

    public static void listarPacientes(ArrayList<Paciente> pacientes) {
        for (int i = 0; i < pacientes.size(); i++) {
            Paciente paciente = pacientes.get(i);
            System.out.println(i + ") " + paciente.nombre);

        }
    }

    public static Paciente crearPacaciente() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        double altura;
        double peso;
        String tipoSangre;
        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.println("edad");
        edad = entrada.nextInt();
        System.out.println("altura ");
        altura = entrada.nextDouble();
        System.out.println("Peso");
        peso = entrada.nextDouble();
        System.out.println("tipo de sangre");
        entrada.nextLine(); // Por el error de lectura de leer un numero y luego un string 
        tipoSangre = entrada.nextLine();

        System.out.println("1. masculino 2. femenino");
        int tipoPaciente = entrada.nextInt();
        /*
        A usar 1 retorno 
        B usar 2 retornos 
         */

        // A 
//            Paciente nuevoPaciente;
//         if(tipoPaciente==1){ //masculino 
//            System.out.println("Ultima revision ");
//            String ultimaRev = entrada.nextLine();
//            nuevoPaciente =  new Masculino(ultimaRev,nombre,edad,altura,peso,tipoSangre);
//        }else{ // femenino 
//            System.out.println("Ultimo peridoo menstrual ");
//            String ultimoPeriodo = entrada.nextLine();
//            System.out.println("Embarazo? 1. si 2.no");
//            int embarazo = entrada.nextInt();
//            boolean isEmbarazda = embarazo==1;
//            nuevoPaciente =  new Femenino(ultimoPeriodo,isEmbarazda,nombre,edad,altura,peso,tipoSangre);
//        }
//                
//        return nuevoPaciente;
//        B
        if (tipoPaciente == 1) { //masculino 
            System.out.println("Ultima revision ");
            entrada.nextLine();
            String ultimaRev = entrada.nextLine();
            return new Masculino(ultimaRev, nombre, edad, altura, peso, tipoSangre);
        } else { // femenino 
            System.out.println("Ultimo peridoo menstrual ");
            entrada.nextLine();
            String ultimoPeriodo = entrada.nextLine();

            System.out.println("Embarazo? 1. si 2.no");
            int embarazo = entrada.nextInt();
            boolean isEmbarazda = embarazo == 1;

            return new Femenino(ultimoPeriodo, isEmbarazda, nombre, edad, altura, peso, tipoSangre);
        }
    }
}
