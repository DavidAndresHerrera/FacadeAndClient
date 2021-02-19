package edu.escuelaing.arep;


import edu.escuelaing.arep.service.ServiceFacadeOperation;
import org.json.JSONObject;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class ServiceFacade {
    public static void main( String[] args )
    {
        port(getPort());
        get("/Operaciones",(req,res)->{
            String operacion = req.queryParams("operacion");
            String dato = req.queryParams("dato");

            return resultado(operacion,dato);
        });



    }

    private static Object resultado(String operacion, String dato) {
        ServiceFacadeOperation consulta = new ServiceFacadeOperation(operacion,dato);
        JSONObject respuesta = new JSONObject(consulta.getOper());
        return respuesta;
    }


    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 36002;
    }
}
