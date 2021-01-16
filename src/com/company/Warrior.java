package com.company;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String damageType) {
        super(health, damage, damageType);
    }

    @Override
    public void applySuperAbility() {

        System.out.println("warrior used : "+damageType);
    }
}
