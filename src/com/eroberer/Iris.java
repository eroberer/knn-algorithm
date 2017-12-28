package com.eroberer;

public class Iris {

    private double sepalLength;
    private double sepalWidth;
    private double petalLength;
    private double petalWidth;
    private IrisType irisType;

    public Iris(double sepalLength, double sepalWidth, double petalLength, double petalWidth, IrisType irisType) {
        this.sepalLength = sepalLength;
        this.sepalWidth = sepalWidth;
        this.petalLength = petalLength;
        this.petalWidth = petalWidth;
        this.irisType = irisType;
    }

    public double[] getAllSize() {

        return new double[] {this.sepalLength, this.sepalWidth, this.petalWidth, this.petalWidth};
    }

    public IrisType getIrisType() {

        return irisType;
    }

    public void setIrisType(IrisType irisType) {

        this.irisType = irisType;
    }

    @Override
    public String toString() {
        return this.sepalLength + "," +
            this.sepalWidth + "," +
            this.petalLength + "," +
            this.petalWidth + "," +
            this.irisType;
    }
}

