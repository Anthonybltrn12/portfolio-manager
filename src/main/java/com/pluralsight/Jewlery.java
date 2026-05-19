package com.pluralsight;

public class Jewlery extends FixedAsset{

    protected double karat;

    public Jewlery(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
