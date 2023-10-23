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

  static Consultas Consultar = new Consultas();
    public static void main(String[] args) {
     String prologQuery = "consult('C:\\\\Pruebas.pl')";
     Query consultQuery = new Query(prologQuery);
       if (consultQuery.hasSolution()){
     System.out.println("Coneccion Realizada");
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

}
      
       
       
    }
}
