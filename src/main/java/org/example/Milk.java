package org.example;

public class Milk extends Product {
    private int fatContent;
    private float packingVolume;

    public Milk(String name, double cost, int fatContent, float packingVolume) {
        super(name, cost);
        this.fatContent = fatContent;
        this.packingVolume = packingVolume;
    }

    @Override
    public String toString() {
        return super.toString() + " fatContent = " + fatContent + "%, liters = " + packingVolume;
    }
}
