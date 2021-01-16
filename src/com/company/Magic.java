package com.company;

public class Magic extends  Hero{
    public Magic(int health, int damage, String damageType) {
        super(health, damage, damageType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic used: "+damageType);
    }
}
