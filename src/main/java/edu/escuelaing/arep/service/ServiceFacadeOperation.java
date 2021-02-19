package edu.escuelaing.arep.service;



import kong.unirest.*;

public class ServiceFacadeOperation {

    String oper;
    String num;



    public ServiceFacadeOperation(String oper, String dato) {
        this.oper = oper;
        this.num = dato;
    }
    public String getOper(){

        HttpResponse<String> consulta = null;
        try {
            //response = Unirest.get("https://trigcalulator.herokuapp.com/Calcular?operacion="+oper+"&dato="+num).asString();
            consulta = Unirest.get("https://trigcalulator.herokuapp.com/Calcular?operacion="+oper+"&dato="+num).asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        System.out.println(consulta.getBody());
        return consulta.getBody();

    }
}
