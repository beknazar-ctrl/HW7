package com.company;

public class Main {

    public static void main(String[] args) {
        HavingSuperAbility[] heroes = new HavingSuperAbility[]{new Magic(34,56,"magicdamage"),new Medic(23,34,"healing"),new Warrior(34,56,"physical")};
        for (HavingSuperAbility tmp:heroes) {
            tmp.applySuperAbility();
        }

    }
}
