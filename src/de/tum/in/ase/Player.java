package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public abstract class Player implements Interactions {
    // TODO: Add missing attributes.
    protected String name;
    protected String specification;
    protected int amountOfArmor;
    protected String weaponType;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int spirit;
    protected double health;
    protected int level;
    protected Armor helmet;
    protected Armor chest;
    protected Armor hands;
    protected Armor legs;
    protected Armor boots;
    protected List<Armor> armor;
    protected Weapon weapon;

    protected Player(String name, String specification, int amountOfArmor, List<Armor> armor, Weapon weapon, String weaponType) {
        this.name = name;
        this.specification = specification;
        this.amountOfArmor = amountOfArmor;
        this.weaponType = weaponType;
        this.armor = armor;
        this.weapon = weapon;
        level = 1;
        health = 200;
        if (weapon.type.equals(weaponType)) {
            weapon.equipped = true;
        }
        equipItems();
    }

    protected boolean isDead() {
        return health == 0;
    }

    protected void equipItems() {
        for (Armor a:armor) {
            if ("Helmet".equals(a.type)) {
                a.equipped = true;

            } else if ("Chest".equals(a.type)) {
                a.equipped = true;
            } else if ("Hands".equals(a.type)) {
                a.equipped = true;
            } else if ("Legs".equals(a.type)) {
                a.equipped = true;
            } else if ("Boots".equals(a.type)) {
                a.equipped = true;
            }
        }

    }

    // TODO: Implement part 3.
}
