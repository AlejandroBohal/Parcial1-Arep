package edu.escuelaing.arep.sparkframework;

import edu.escuelaing.arep.calculator.Calculator;
import edu.escuelaing.arep.servers.HTTPServer;

import com.google.gson.Gson;

/**
 * The type Spark a server.
 */
public class SparkAServer {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        Calculator c = new Calculator();
        HTTPServer server =  new HTTPServer();
        server.setPort(getPort());
        server.start();

        SparkA.post("/calculate",(request, response) -> {
            String string = c.calculate(request.getBody());
            Gson gson = new Gson();
            return gson.toJson(string);
        });
        
    }
    /**
     * Gets port.
     *
     * @return the port
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 36000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}
