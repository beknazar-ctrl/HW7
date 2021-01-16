package com.company;

public class Medic extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Medic used: "+damageType);
    }

    public Medic(int health,int damage,String damageType) {
        super(health,damage,damageType);
    }
}
