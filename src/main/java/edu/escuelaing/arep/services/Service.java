package edu.escuelaing.arep.services;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import edu.escuelaing.arep.math.Statistics;
import edu.escuelaing.arep.sorting.BubbleSort;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public static JsonObject makeOperations(JsonArray array){
        JsonObject json = new JsonObject();
        List<Double> numbers = new ArrayList<Double>();
        array.forEach(e -> numbers.add(e.getAsDouble()));
        BubbleSort<Double> sorter = new BubbleSort<Double>();
        sorter.sort(numbers);
        Statistics mathOps = new Statistics();
        Double avg = mathOps.mean(numbers);
        Double sum = mathOps.sum(numbers);
        json.addProperty("orderedNumbers", numbers.toString());
        json.addProperty("sum", sum.toString());
        json.addProperty("avg", avg.toString());
        return  json;
    }
}
