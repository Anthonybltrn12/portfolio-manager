package com.pluralsight.finance;

import com.pluralsight.IValuable;

import java.util.ArrayList;

public class Portfolio {
    protected String name;
    protected String owner;
    protected ArrayList<IValuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAssets(IValuable assets){
        this.assets.add(assets);
    }

    public double getValue(){
        double totalValue = 0;
        for(IValuable asset : this.assets){
            totalValue += asset.getValue();
        }
        return totalValue;
    }

    public IValuable getMostValuable(){
        IValuable mostValuable = this.assets.get(0);
        for(IValuable asset : this.assets){
            if(asset.getValue() > mostValuable.getValue()){
                mostValuable = asset;
            }
        }
        return mostValuable;
    }

    public IValuable getLeastValuable(){
        IValuable leastValuable = this.assets.get(0);
        for(IValuable asset : this.assets){
            if(asset.getValue() < leastValuable.getValue()){
                leastValuable = asset;
            }
        }
        return leastValuable;
    }

}
