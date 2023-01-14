package org.example;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProductList().add(new Product("apple", 10));
        vendingMachine.getProductList().add(new Baton("Mars", 20, 134.2342));
        vendingMachine.getProductList().add(new SuperBaton("BIG Snickers", 15, 254.123, TypeSize.BIG));
        vendingMachine.getProductList().add(new Chocolate("Milka", 45, 75));
        vendingMachine.getProductList().add(new Milk("Prostokvashino", 45, 3, 1));
        for (Product product : vendingMachine.getProductList()) {
            System.out.println(product);
        }
    }
}