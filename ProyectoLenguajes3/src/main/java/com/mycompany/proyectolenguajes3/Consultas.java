/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolenguajes3;
import org.jpl7.*;
import java.util.Map;

/**
 *
 * @author corre
 */
public class Consultas {
    
        //Creacion del arbol de contagios
    public void spread_disease(){
    String prologQuery = "spread_desease(X,Y).";
    Query query = new Query(prologQuery);
    
    //Forma el arbol de contagios segun establecido en el documento pl
    while(query.hasNext()){
     Map<String, Term> binding = query.nextSolution();
        Term x = (Term) binding.get("X");
        Term y = (Term) binding.get("Y");
        System.out.println(x +" fue contagiado por " + y );
    }
       

    }
    //Consulta "Se cuida algo"
    public void se_cuida_algo(String X){
        String prologQuery = "se_cuida_algo("+ X +").";
        Query query = new Query(prologQuery);

        //Si el resultado es true, si no, devuelve el segmento de codigo hallado en el else
        if (query.hasSolution()){
                System.out.println(X + " se cuida algo");
        }
        else{
                System.out.println(X + " no se cuida nada");
        }
    }
    //Consulta "Se cuida mucho"
    public void se_cuida_mucho(String X){
        String prologQuery = "se_cuida_mucho("+ X +").";
        Query query = new Query(prologQuery);
        //Si el resultado es true, si no, devuelve el segmento de codigo hallado en el else
        if (query.hasSolution()){
                System.out.println(X + " se cuida mucho");
        }
        else{
                System.out.println(X + " no se cuida lo suficiente");
        }
    }
    
    //Consulta que valora la edad de la persona
    public void es_edad_avanzada(String X){
        String prologQuery = "es_de_edad_avanzada("+ X +").";
        Query query = new Query(prologQuery);

        //Si la consulta da true, es decir, la edad es mayor a 65, es true, si no, devuelve el segmento de codigo hallado en el else
        if (query.hasSolution()){
                System.out.println(X + " es de edad avanzada");
        }
        else{
                System.out.println(X + " no es de edad avanzada");
        }
    }
    //Consulta si la persona presenta sintomas relaiconados al COVID 19
    public void tiene_sintomas(String X){
        String prologQuery = "tiene_sintomas("+ X +").";
        Query query = new Query(prologQuery);
        //Si presenta algun sintoma, devuelve true, o si no, devuelve negativo
        if (query.hasSolution()){
                System.out.println(X + " esta enfermo");
        }
        else{
                System.out.println(X + " no esta enfermo");
        }
    }

    //Valora si la persona contagiada de COVID presenta sintomas 
     public void es_asintomatico(String X){
        String prologQuery = "es_asintomatico("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X + " es asintomatico");
        }
        else{
                System.out.println(X + " no es asintomatico");
        }
    }
    //Valora si la persona tiene antecedentes relacionados al COVID 
     public void tiene_antecedentes(String X){
        String prologQuery = "tiene_antecedentes("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X + " a tenido relacion con el covid");
        }
        else{
                System.out.println(X + " no a tenido relacion con el covid");
        }
    }
    //Valora si la persona consultada ha tenido contacto con alguien posit
     public void ha_tenido_contacto(String X){
        String prologQuery = "ha_tenido_contacto("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X + " a estado cerca de alguien con covid");
        }
        else{
                System.out.println(X + " no a estado cerca de alguien con covid");
        }
    }
    //Valora si la persona consultada ha estado en aglomeraciones
     public void contacto_con_muchas_personas(String X){
        String prologQuery = "contacto_con_muchas_personas("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X + " a estado en una agromeracion ");
        }
        else{
                System.out.println(X + " no a estado en una agromeracion");
        }
    }
    //Consulta el imc de la persona ingresada y valora si tiene o no sobrepeso
     public void sobrepeso(String X){
        String prologQuery = "sobrepeso("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X + " tiene sobrepeso");
        }
        else{
                System.out.println(X + " no tiene sobrepeso");
        }
    }
    //Valora si la persona consultada tiene algun riesgo con respecto al COVID 
     public void tiene_algun_riesgo(String X){
        String prologQuery = "tiene_algun_riesgo("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X + " esta en riesgo de morir de covid");
        }
        else{
                System.out.println(X + " no tiene ningun factor de riesgo");
        }
    }
    //Valora si la oersona tiene muchos padecimientos que significan riesgos al contraer COVID 
     public void alto_riesgo(String X){
        String prologQuery = "alto_riesgo("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X + " tiene riesgo maximo de morir de covid");
        }
        else{
                System.out.println(X + " no tiene riesgo maximo de morir de covid");
        }
    }
    //Consulta si la persona debe realizar cuarentena luego de tener contacto con uno o más contagiados
     public void cuarentena_despues_contacto(String X){
        String prologQuery = "cuarentena_despues_contacto("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X + " tiene que estar en cuarentena");
        }
        else{
                System.out.println(X + " no tiene que estar en cuarentena");
        }
    }
    //Consulta si la persona tiene las vacunas minimas para realizar un viaje
     public void vacunas_minimas_para_viajar(String X){
        String prologQuery = "vacunas_minimas_para_viajar("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X + " cumple con las vacunas minimas para viajar");
        }
        else{
                System.out.println(X + " no cumple con las vacunas minimas para viajar");
        }
    }
    //Consulta si el destino es riesgoso debido a su sitaucion de COVID
    public void noSeRecomiendaViajar(String X){
        String prologQuery = "noSeRecomiendaViajar('"+ X +"').";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println("No se recomienda viajar a "+ X);
        }
        else{
                System.out.println("Se puede viajar a " + X);
        }
    } 
    //Diagnostica si la persona  debe atender a un experto medico
    public void enviar_a_especialista(String X){
        String prologQuery = "enviar_a_especialista("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X+" se debe enviar con un especialista");
        } 
        else{
                System.out.println( X+" no se debe enviar con un especialista");
        }
    }
    //Diagnostica si la persona debe realizarse una pcr
    public void realizar_pcr(String X){
        String prologQuery = "realizar_pcr("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X+" tiene que realizarse una pcr");
        } 
        else{
                System.out.println( X+" no tiene que realizarse una pcr");
        }
    }
    //Receta una cuarentena despues de un viaje segun sus condiciones
       public void cuarentena_despues_de_viaje(String X){
        String prologQuery = "cuarentena_despues_de_viaje("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X+" Tiene que realizar cuarentena ");
        } 
        else{
                System.out.println( X+" no tiene que realizar cuarentena");
        }
    }
    //Diagnostica si la persona tiene fiebre, uno de los sintomas del covid
       public void tieneFiebre(String X){
        String prologQuery = "tieneFiebre("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X+" tiene fiebre");
        } 
        else{
                System.out.println( X+" no tiene fiebre");
        }
    }
    //Diagnostica si la persona sufre la perdida de los sentidos, uno de los sintomas del covid
    public void perdida_de_sentidos(String X){
        String prologQuery = "perdida_de_sentidos("+ X +").";
        Query query = new Query(prologQuery);

        if (query.hasSolution()){
                System.out.println(X+" tiene perdida de sentidos");
        } 
        else{
                System.out.println( X+" no tiene perdida de sentidos");
        }
    }
    //Valora si la persona tiene un esquema de vacunas completo
    public void completamente_vacunado(String X){

        String prologQuery = "completamente_vacunado("+ X +",Y).";
        Query query = new Query(prologQuery);
       if (query.hasSolution()){
                Map<String, Term> binding = query.nextSolution();
                Term y = (Term) binding.get("Y");
                System.out.println("Lista de vacunas pendientes " + y);

        }
        else{
                System.out.println(X + " no esta vacunado ");
        }
    }
}
