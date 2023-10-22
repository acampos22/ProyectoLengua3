/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectolenguajes3;
import org.jpl7.*;
/**
 *
 * @author corre
 */
public class ProyectoLenguajes3 {

    public static void main(String[] args) {
     String prologQuery = "consult('C:\\\\Pruebas.pl')";
     Query consultQuery = new Query(prologQuery);
        System.out.println("Hello World!");
       if (consultQuery.hasSolution()){
     System.out.println("Correct");
}
    }
}
