package org.example.rpg;

public class Witch extends Monster implements Bleedable {
    public Witch(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }
}
