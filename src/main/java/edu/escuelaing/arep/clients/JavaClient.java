package edu.escuelaing.arep.clients;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Cliente java que tiene la url de heroku quemada
 */
public class JavaClient {
    /**
     * Realiza un Post a la pagina de heroku
     * dado el string de numeros dentro de este mismo metodo
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://parcial-alejandrobohorquez.herokuapp.com/calculate");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        String numbers = "1.2,3.5,2.1,2.9,1.0,2.2"; //change to use the client.
        connection.setRequestProperty("Content-Type", "text/plain");
        connection.setRequestProperty("Accept", "text/plain");
        OutputStreamWriter streamWriter = new OutputStreamWriter(connection.getOutputStream());
        streamWriter.write(numbers);
        streamWriter.flush();
        StringBuilder stringBuilder = new StringBuilder();
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK){
            InputStreamReader streamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            String response = null;
            while ((response = bufferedReader.readLine()) != null) {
                stringBuilder.append(response + "\n");
            }
            bufferedReader.close();
            System.out.println(stringBuilder.toString());
        } else {
            System.out.println("");
        }
    }

}
