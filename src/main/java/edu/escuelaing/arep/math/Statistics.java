package edu.escuelaing.arep.math;

import java.util.List;

public class Statistics {

    public Double mean(List<Double> numbers){
        return numbers.stream().mapToDouble(E -> E).average().orElse(0.0);
    }

    public Double sum(List<Double> numbers){
        return numbers.stream().mapToDouble(E -> E).sum();
    }
}
