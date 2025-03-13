package org.example.model;

public class Store {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("snack", 20, "dark chocolate");
        Coke coke = new Coke("drink", 20, "coke with sugar");
        Bread bread = new Bread("grain", 5, "toasted bread");

        ProductForSale[] products = { chocolate, coke, bread };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product: products) {
            product.showDetails();
        }
    }
}