package org.example.model;

public class Coke extends ProductForSale {
    public boolean sugar;

    public Coke(String type, int price, String description) {
        super(type, price, description);
        sugar = true;
    }

    @Override
    public void showDetails() {
        System.out.println("Sugar: " + sugar + super.toString());
    }
}
