package com.company;

public abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String damageType;

    public Hero(int health, int damage, String damageType) {
        this.health = health;
        this.damage = damage;
        this.damageType = damageType;
    }
}
