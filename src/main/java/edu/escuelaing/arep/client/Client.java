package edu.escuelaing.arep.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        URL url =new URL("https://rocky-ocean-55000.herokuapp.com/results");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("POST");
        urlConnection.setDoOutput(true);
        String numbers = "1 2 3 4 5 5.3 78 9";
        BufferedReader inClient = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), StandardCharsets.UTF_8));
        OutputStream outToService = urlConnection.getOutputStream();
        byte[] file = numbers.getBytes(StandardCharsets.UTF_8);
        outToService.write(file, 0, file.length);
        StringBuilder response = new StringBuilder();
        String responseLine =  null;
        while((responseLine = inClient.readLine()) != null){
            response.append(responseLine.trim());
        }
        System.out.println(response.toString());
    }
}
