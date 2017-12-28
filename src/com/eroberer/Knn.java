package com.eroberer;

import java.util.*;

public class Knn {

    private double getDistance(double[] p, double[] k) {
        int dimension = p.length;
        double distance = 0;

        for (int i = 0; i < dimension; i++) {
            distance += Math.pow(Math.abs(p[i] - k[i]), 2);
        }

        return Math.sqrt(distance);
    }


    public IrisType getIrisType(int k, List<Iris> dataset, Iris newIris) {
        Map<Double, Iris> neighbourDistance = new TreeMap<>();

        for (Iris iris : dataset) {
            neighbourDistance.put(getDistance(newIris.getAllSize(), iris.getAllSize()), iris);
        }

        int counter = 0;
        Map<IrisType, Integer> irisTypes = new TreeMap<>();

        for (Map.Entry<Double, Iris> neighbour : neighbourDistance.entrySet()) {
            if (counter == k) break;

            irisTypes.put(neighbour.getValue().getIrisType(),
                    (irisTypes.get(neighbour.getValue().getIrisType()) == null ?
                            0 : irisTypes.get(neighbour.getValue().getIrisType())) + 1);

            counter++;
        }

        return irisTypes.entrySet().iterator().next().getKey();
    }
}
