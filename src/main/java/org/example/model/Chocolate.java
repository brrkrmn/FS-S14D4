package org.example.model;

public class Chocolate extends ProductForSale {
    public boolean dark;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        dark = true;
    }

    @Override
    public void showDetails() {
        System.out.println("Dark: " + dark + super.toString());

    }
}
