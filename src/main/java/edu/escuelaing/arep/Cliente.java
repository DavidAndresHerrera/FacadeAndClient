package edu.escuelaing.arep;


import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;



public class Cliente {

    public static void main(String[] args) {
        pruebaCalculadora();
    }

    private static void pruebaCalculadora() {
        HttpResponse<String> response = null;
        try {
            response = Unirest.get("https://trigcalulator.herokuapp.com/Calcular?operacion=sin&dato=3.1416").asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        System.out.println("el resultado es: ");
        System.out.println(response.getBody());
    }

}
