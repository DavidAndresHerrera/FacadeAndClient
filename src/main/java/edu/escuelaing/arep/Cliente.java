package edu.escuelaing.arep;


import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;



public class Cliente {

    public static void main(String[] args) {
        pruebaCalculadora();
        pruebaFacade();
    }


    private static void pruebaCalculadora() {
        HttpResponse<String> consulta = null;
        try {
            consulta = Unirest.get("https://trigcalulator.herokuapp.com/Calcular?operacion=sin&dato=3.1416").asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        System.out.println("el resultado es: ");
        System.out.println(consulta.getBody());
    }


    private static void pruebaFacade() {

        HttpResponse<String> consulta = null;
        try {
            consulta = Unirest.get("https://servicefacade.herokuapp.com/Operaciones?operacion=cos&dato=2").asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        System.out.println("el resultado es: ");
        System.out.println(consulta.getBody());
    }

}
