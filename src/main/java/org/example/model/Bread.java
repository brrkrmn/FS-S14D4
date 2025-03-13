package org.example.model;

public class Bread extends ProductForSale {
    public boolean toast;
    public Bread(String type, int price, String description) {
        super(type, price, description);
        toast = true;
    }

    @Override
    public void showDetails() {
        System.out.println("Toast: " + toast + super.toString());
    }
}
