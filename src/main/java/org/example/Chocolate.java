package org.example;

public class Chocolate extends Product {
    private int cocoaPercent;

    public Chocolate(String name, double cost, int cocoaPercent) {
        super(name, cost);
        this.cocoaPercent = cocoaPercent;
    }

    @Override
    public String toString() {
        return super.toString() + " cocoa content: " + this.cocoaPercent + '%';
    }
}
