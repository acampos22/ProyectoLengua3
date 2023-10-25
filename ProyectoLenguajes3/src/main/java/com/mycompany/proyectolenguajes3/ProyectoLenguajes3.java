/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectolenguajes3;
import java.util.Scanner;

import org.jpl7.*;
/**
 *
 * @author corre
 */
public class ProyectoLenguajes3 {

    /*
     * Conexion al script de prolog. La conexion se realiza mediante el uso de un query, el cual consulta
     * si la ruta brindada es valida Y contiene un formato de archivo adaptable a prolog.
     */
    public static void main(String[] args) {
    Consultas Consultar = new Consultas();
     String prologQuery = "consult('C:\\\\Pruebas.pl')";
     Query consultQuery = new Query(prologQuery);
       if (consultQuery.hasSolution()){
     System.out.println("Conexion Realizada");
    menu();
}
      
       
       
    }


/*
 * Menu principal. El usuario debe ingresar números para poder manejar las opciones del sistema.
 * El sistema únicamente registra entradas númericas, de lo contrario, valida y deja una advertencia al usuario de que ingrese
 * una entrada numerica
 */
public static void menu() {
    Scanner scanner = new Scanner(System.in);
    int opcion;
      Consultas Consultar = new Consultas();


    do {
        /*
         * Do while del menu principal
         */
        System.out.println("Menú:");
        System.out.println("1. Consultar");
        System.out.println("2. Ver la  la relación entre los pacientes infectados.");
        System.out.println("3. Consultas de ejemplo");
        System.out.println("4. Salir");
        System.out.print("Por favor, ingrese una opcion: ");
    

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1: //redirecciona al menu de paginas
                System.out.println("Has seleccionado Consultar.");
                menuConsultas(scanner, Consultar);
                break;
            case 2: 
            //Ver arbol de infectados. Despliega el arbol de infectados consultado
            System.out.println("relacion de pacientes infectados ");
            Consultar.spread_disease();
                break;
            case 3:
            //Ejemplos de consultas 
            System.out.println("Consultas de ejemplo");
            ejemplo(Consultar);

            case 4:
            //Salir del sistema. Desactiva las opciones y ejecuta el procedimiento para salir del sistema
                System.out.println("Has seleccionado Salir.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, ingrese 1 o 2.");
        }
    } while (opcion != 4);

    // Cerrar el scanner cuando hayas terminado
    scanner.close();
}

 /*
 Menú principal de consultas. El usuario selecciona la pagina a la cual 
 se quiere dirigir, dependiendo de la consulta que pretenda realizar
*/
public static void menuConsultas(Scanner scanner, Consultas Consultar) {
    int opcion = 1;
    int pagina = 1;
    //Do while para el menu consultas
    do {
        switch (pagina) {
            case 1:
                System.out.println("Pagina 1.");
                //Regla de si alguien no cumple los cuidados
                System.out.println("1. Consultar si alguien se cuida lo minimo");
                //Regla de si alguien cumple con todos los cuidados
                System.out.println("2. Consultar si alguien se cuida al maximo");
                //Regla edad avanzada
                System.out.println("3. Consultar si alguien es de edad avanzada");
                //Reglas que muestran si la persona ingresada es asintomatica
                System.out.println("4. Consultar si alguien tiene sintomas");
                System.out.println("5. Consultar si alguien es es asintomatico");
                //Avanza a la proxima pagina 
                System.out.println("6. Proxima pagina");
                System.out.println("7. salir");
                opcion = scanner.nextInt();
                pagina = pagina1(opcion, Consultar, scanner);

                break;
            case 2: 
                System.out.println("Pagina 2.");
                //Pagina dedicada al historial medico de los pacientes
                //Consulta a antecedentes previos relacionados a la enfermedad
                System.out.println("1. Consultar si alguien tiene antecedentes");
                //Regla que establece contactos entre personas
                System.out.println("2. Consultar si alguien ha tenido contacto con alguien con covid");
                //Regla que dicta si la persona contagiada o en riesgo de contagiarse se expuso a una cantidad significativa de personas
                System.out.println("3. Consultar si alguien ha estado en una agromeracion");
                //Regla que contiene el IMC de una persona y dicta si esta sufre de sobrepeso
                System.out.println("4. Consultar si alguien tiene sobrepeso");
                //Devuelve las posibles personas que corren riesgo con la enfermedad
                System.out.println("5. Consultar si alguien tiene algun riesgo");
                //avanza a la proxima pagina 
                System.out.println("6. Proxima pagina");
                System.out.println("7. salir");
                opcion = scanner.nextInt();
                pagina = pagina2(opcion, Consultar, scanner);
                break;
                case 3:
                System.out.println("Pagina 3."); 
                //Regla que permite consultar si una persona tiene un alto riesgo de contagio de COVID-19.
                System.out.println("1. Consultar si alguien tiene alto riesgo"); 
                //Regla que determina si una persona debe estar en cuarentena debido al contacto con un caso positivo de COVID-19.
                System.out.println("2. Consultar si alguien ocupa cuarentena por contacto");
                //Regla que verifica si una persona ha recibido las vacunas necesarias para viajar.
                System.out.println("3. Consultar si alguien cumple con las vacunas mínimas para viajar"); 
                //Regla que evalúa si se recomienda viajar a un país en función de las condiciones actuales de COVID-19 en ese lugar.
                System.out.println("4. Consultar si se recomienda viajar a un país"); 
                //Regla que permite determinar si una persona debe ser remitida a un especialista médico debido a sus síntomas
                System.out.println("5. Consultar si alguien se debe enviar con un especialista");            
                System.out.println("6. Próxima página"); 
                System.out.println("7. Salir"); 
                opcion = scanner.nextInt(); 
                pagina = pagina3(opcion, Consultar, scanner); 
                break;
            
            case 4:
                System.out.println("Pagina 4.");
                //Regla que permite consultar si una persona debe o debería realizarse una prueba de PCR.
                System.out.println("1. Consultar si alguien tiene que realizarse la pcr");
                //Regla que determina si una persona debe entrar en cuarentena después de un viaje.
                System.out.println("2. Consultar si alguien ocupa cuarentena despues de un viaje");
                //Regla que verifica si una persona tiene fiebre, un síntoma común de COVID-19.
                System.out.println("3. Consultar si alguien tiene fiebre");
                // Regla que evalúa si una persona ha perdido el sentido del olfato o del gusto, otro síntoma asociado a COVID-19.
                System.out.println("4. Consultar si alguien tiene perdida de sentidos");
                // Regla que determina las vacunas que una persona aún necesita para estar completamente vacunada.
                System.out.println("5. Consultar las vacunas que le faltan a alguien");
                System.out.println("6. Proxima pagina");
                System.out.println("7. salir");
                opcion = scanner.nextInt();
                pagina = pagina4(opcion, Consultar, scanner);
                break;
            case 0:
                break;
              
            default:
                pagina = 1;
        }
    } while (pagina != 0);

    // Cerrar el scanner cuando hayas terminado
}

 //Opciones para la pagina 1 
public static int pagina1(int opcion,Consultas Consultar, Scanner scanner) {

        if(opcion >= 7){
          return 0;
        }
        if (opcion == 6){
          return 2;
        }
        //Lee a la persona que se desea realizar el estudio y la consulta
        String persona;
        System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
         persona = scanner.next();

         //Ejecución de las reglas mediante la llamada a la clase Consultas
        switch (opcion) {
            case 1:
            //Consulta los habitos de la persona y diagnostica si se cuida algo
                Consultar.se_cuida_algo(persona);
                break;
            case 2: 
            //Consulta los habitos de la persona y diagnostica si se cuida mucho
                Consultar.se_cuida_mucho(persona);
                    break;
            case 3:
            //Consulta la edad de la persona ingresada y dicta si es o no de edad avanzada
                Consultar.es_edad_avanzada(persona);
                    break;
            case 4:
            //Consulta si la persona tiene algun sintoma relacionado con el COVID 19 
                Consultar.tiene_sintomas(persona);
                    break;
            case 5:
            //Consulta si la persona tiene COVID y no presenta algun síntoma
                Consultar.es_asintomatico(persona);
                    break;
        }
    return 1;
}

 //Opciones para la pagina 2 
public static int pagina2(int opcion,Consultas Consultar, Scanner scanner) {

        if(opcion >= 7){
          return 0;
        }
        if (opcion == 6){
          return 3;
        }
         //Lee a la persona que se desea realizar el estudio y la consulta
        String persona;
        System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
        persona = scanner.next();
        //Ejecución de las reglas mediante la llamada a la clase Consultas
        switch (opcion) {
            case 1:
            //Consulta si la persona tiene antecedentes relacionados con el COVID
                Consultar.tiene_antecedentes(persona);
                break;
            case 2: 
            //consulta si la persona ha tenido contacto con alguna persona infectada con el COVID
                Consultar.ha_tenido_contacto(persona);
                    break;
            case 3:
            //Consulta si la persona ha estado metido/a en aglomeraciones
                Consultar.contacto_con_muchas_personas(persona);
                    break;
            case 4:
            //Consulta el imc de la persona ingresada y diagnostica si tiene o no sobrepeso
                Consultar.sobrepeso(persona);
                    break;
            case 5:
            //COnsulta si la persona tiene algun riesgo 
                Consultar.tiene_algun_riesgo(persona);
                    break;
        }

    return 2;
}
public static int pagina3(int opcion,Consultas Consultar, Scanner scanner) {

        if(opcion >= 7){
          return 0;
        }
        if (opcion == 6){
          return 4;
        }
 String persona;
 //Opciones para la pagina 3 
        switch (opcion) {
            case 1:
            /*Solicita el nombre de la persona y realiza la consulta del riesgo que corre de contagiarse
            dependiendo de sus habitos y compañias
            */
              System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
              persona = scanner.next();
                Consultar.alto_riesgo(persona);
                break;
            case 2: 
            /*Solicita el nombre de la persona y realiza la consulta dependiendo si cumple con los requisitos para 
            recetarle cuarentena despues del contacto con otros infectados
            */
                 System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
                persona = scanner.next();
                Consultar.cuarentena_despues_contacto(persona);
                    break;
            case 3:
            /*
             * Solicita el nombre de la persona a consultar si cumple con las vacunas minimas para realizar un viaje 
             */
                System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
               persona = scanner.next();
                Consultar.vacunas_minimas_para_viajar(persona);
                    break;
            case 4:
            /*Solicita el nombre de un país y realiza el diagnostico dependiendo de si es seguro o no viajar dependiendo de su
            del numero de contagios por pais*/
                System.out.println("A que pais le desea realizar la consulta(nombre con minusculas)?");
                persona = scanner.next();
                Consultar.noSeRecomiendaViajar(persona);
                    break;
            case 5:
                System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
              persona = scanner.next();
                Consultar.enviar_a_especialista(persona);
                    break;
        }

    return 3;
}

public static int pagina4(int opcion,Consultas Consultar, Scanner scanner) {

        if(opcion >= 7){
          return 0;
        }
        if (opcion == 6){
          return 1;
        }
        String persona;
        System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
         persona = scanner.next();

        switch (opcion) {
            case 1:
            //Diagnostica a una persona para que se realice una pcr
             
                Consultar.realizar_pcr(persona);
                break;
            case 2: 
            //Le diagnostica a una persona una cuarentena posterior a un viaje realizado
             
                Consultar.cuarentena_despues_de_viaje(persona);
                    break;
            case 3:
            
             //Diagnostica si tiene fiebre, uno de los sintomas del COVID 19
             
                Consultar.tieneFiebre(persona);
                    break;
            case 4:
            // Diagnostica si tiene fiebre, uno de los sintomas del COVID 19
                  Consultar.perdida_de_sentidos(persona);
                    break;
            case 5:
            //Consulta si la persona tiene su esquema de vacunacion completo
                Consultar.completamente_vacunado(persona);
                    break;
        }

    return 4;
}


public static void ejemplo(Consultas Consultar){
    //metodo de ejemplos para consultas
    Consultar.spread_disease();
    Consultar.se_cuida_algo("juanito");
    Consultar.se_cuida_mucho("juanito");
    Consultar.se_cuida_mucho("juan");
    
    Consultar.tiene_sintomas("messi");
    Consultar.es_asintomatico("messi");
    Consultar.es_edad_avanzada("luis");
    Consultar.contacto_con_muchas_personas("messi");
    
    Consultar.tiene_antecedentes("luis");
    Consultar.ha_tenido_contacto("luis");

    Consultar.sobrepeso("messi");
    Consultar.tiene_algun_riesgo("luis");
    Consultar.alto_riesgo("luis");
    
    Consultar.cuarentena_despues_contacto("messi");
    Consultar.vacunas_minimas_para_viajar("juan");
    Consultar.noSeRecomiendaViajar("australia");
    Consultar.perdida_de_sentidos("messi");
    Consultar.enviar_a_especialista("jorge");
    Consultar.realizar_pcr("antonio");

    Consultar.completamente_vacunado("jorge");
    Consultar.completamente_vacunado("ana");
}

}
