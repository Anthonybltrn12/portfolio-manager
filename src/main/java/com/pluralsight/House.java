package com.pluralsight;

public class House extends FixedAsset{
    protected int yearBuilt;
    protected int squareFeet;
    protected int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
