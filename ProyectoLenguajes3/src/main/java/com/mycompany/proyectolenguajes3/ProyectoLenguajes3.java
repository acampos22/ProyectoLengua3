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

   
    public static void main(String[] args) {
    Consultas Consultar = new Consultas();
     String prologQuery = "consult('C:\\\\Pruebas.pl')";
     Query consultQuery = new Query(prologQuery);
       if (consultQuery.hasSolution()){
     System.out.println("Coneccion Realizada");
    menu();
}
      
       
       
    }


public static void menu() {
    Scanner scanner = new Scanner(System.in);
    int opcion;
      Consultas Consultar = new Consultas();


    do {
        System.out.println("Menú:");
        System.out.println("1. Consultar");
        System.out.println("2. Ver la  la relación entre los pacientes infectados.");
        System.out.println("3. Consultas de ejemplo");
        System.out.println("4. Salir");
        System.out.print("Por favor, ingrese una opcion: ");
    

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado Consultar.");
                menuConsultas(scanner, Consultar);
                break;
            case 2: 
            System.out.println("relacion de pacientes infectados ");
            Consultar.spread_disease();
                break;
            case 3:

            System.out.println("Consultas de ejemplo");
            ejemplo(Consultar);

            case 4:
                System.out.println("Has seleccionado Salir.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, ingrese 1 o 2.");
        }
    } while (opcion != 4);

    // Cerrar el scanner cuando hayas terminado
    scanner.close();
}


public static void menuConsultas(Scanner scanner, Consultas Consultar) {
    int opcion = 1;
    int pagina = 1;


    do {
       
    

       

        switch (pagina) {
            case 1:
                System.out.println("Pagina 1.");
                System.out.println("1. Consultar si alguien se cuida lo minimo");
                System.out.println("2. Consultar si alguien se cuida al maximo");
                System.out.println("3. Consultar si alguien es de edad avanzada");
                System.out.println("4. Consultar si alguien tiene sintomas");
                System.out.println("5. Consultar si alguien es es asintomatico");
                System.out.println("6. Proxima pagina");
                System.out.println("7. salir");
                opcion = scanner.nextInt();
                pagina = pagina1(opcion, Consultar, scanner);

                break;
            case 2: 
                System.out.println("Pagina 2.");
                System.out.println("1. Consultar si alguien tiene antecedentes");
                System.out.println("2. Consultar si alguien a tenido contacto con alguien con covid");
                System.out.println("3. Consultar si alguien a estado en una agromeracion");
                System.out.println("4. Consultar si alguien tiene sobrepeso");
                System.out.println("5. Consultar si alguien tiene algun riesgo");
                System.out.println("6. Proxima pagina");
                System.out.println("7. salir");
                opcion = scanner.nextInt();
                pagina = pagina2(opcion, Consultar, scanner);
                break;
            case 3:
                System.out.println("Pagina 3.");
                System.out.println("1. Consultar si alguien tiene alto riesgo");
                System.out.println("2. Consultar si alguien ocupa cuarentena por contacto");
                System.out.println("3. Consultari si alguien cumple con las vacunas minimas para viajar");
                System.out.println("4. Consultar si se recomienda viajar a un pais");
                System.out.println("5. Consultar si alguien se ocupa mandar con un especilista");
                System.out.println("6. Proxima pagina");
                System.out.println("7. salir");
                opcion = scanner.nextInt();
                pagina = pagina3(opcion, Consultar, scanner);
                break;
            case 4:
                System.out.println("Pagina 4.");
                System.out.println("1. Consultar si alguien tiene que realizarse la pcr");
                System.out.println("2. Consultar si alguien ocupa cuarentena despues de un viaje");
                System.out.println("3. Consultar si alguien tiene fiebre");
                System.out.println("4. Consultar si alguien tiene perdida de sentidos");
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


public static int pagina1(int opcion,Consultas Consultar, Scanner scanner) {

        if(opcion >= 7){
          return 0;
        }
        if (opcion == 6){
          return 2;
        }
        String persona;
        System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
         persona = scanner.next();

        switch (opcion) {
            case 1:
                Consultar.se_cuida_algo(persona);
                break;
            case 2: 
                Consultar.se_cuida_mucho(persona);
                    break;
            case 3:
                Consultar.es_edad_avanzada(persona);
                    break;
            case 4:
                Consultar.tiene_sintomas(persona);
                    break;
            case 5:
                Consultar.es_asintomatico(persona);
                    break;
        }

    return 1;
}

public static int pagina2(int opcion,Consultas Consultar, Scanner scanner) {

        if(opcion >= 7){
          return 0;
        }
        if (opcion == 6){
          return 3;
        }
        String persona;
        System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
         persona = scanner.next();

        switch (opcion) {
            case 1:
                Consultar.tiene_antecedentes(persona);
                break;
            case 2: 
                Consultar.ha_tenido_contacto(persona);
                    break;
            case 3:
                Consultar.contacto_con_muchas_personas(persona);
                    break;
            case 4:
                Consultar.sobrepeso(persona);
                    break;
            case 5:
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
        
        switch (opcion) {
            case 1:
              System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
              persona = scanner.next();
                Consultar.alto_riesgo(persona);
                break;
            case 2: 
                 System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
                persona = scanner.next();
                Consultar.cuarentena_despues_contacto(persona);
                    break;
            case 3:
                System.out.println("A quien le desea realizar la consulta(nombre con minusculas)?");
               persona = scanner.next();
                Consultar.vacunas_minimas_para_viajar(persona);
                    break;
            case 4:
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
                Consultar.realizar_pcr(persona);
                break;
            case 2: 
                Consultar.cuarentena_despues_de_viaje(persona);
                    break;
            case 3:
                Consultar.tieneFiebre(persona);
                    break;
            case 4:
                  Consultar.perdida_de_sentidos(persona);
                    break;
            case 5:
                Consultar.completamente_vacunado(persona);
                    break;
        }

    return 4;
}


public static void ejemplo(Consultas Consultar){
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
