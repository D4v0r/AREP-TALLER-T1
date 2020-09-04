package edu.escuelaing.arep.webservice;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import edu.escuelaing.arep.services.Service;
import org.apache.commons.io.FileUtils;
import spark.Request;
import spark.Response;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static spark.Spark.*;

public class WebService {
    public static void main(String[] args) {
        port(getPort());
        get("/", (req, res) -> {
            String page = FileUtils.readFileToString(new File("src/main/resources/index.html"), StandardCharsets.UTF_8);
            return page;
        });

        post("/services", (request, response) -> {
            response.status(200);
            response.type("application/json");
            String[] data = request.body().split(" ");
            JsonArray array =  new JsonArray();
            for (String e: data){
               array.add( Double.parseDouble(e));
            }
            return Service.makeOperations(array);
        });

        post("/results", (request, response) -> {
            JsonObject jsonObject = new JsonParser().parse(request.body()).getAsJsonObject();
            response.type("application/json");
            return Service.makeOperations(jsonObject.get("value").getAsJsonArray());
        });

    }

    private static int getPort(){
        if (System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
