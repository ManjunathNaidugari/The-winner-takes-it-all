package de.tum.in.ase;

import java.util.List;

public class Tank extends Player {
    // TODO: Implement part 4.

    private List<Ability> abilities;
    private Armor shield;

    public Tank(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType, Armor shield) {
        super(name, "Tank", 30, armor, weapon, weaponType);
        this.abilities = abilities;
        strength = 15;
        intelligence = 4;
        agility = 6;
        spirit = 2;
        this.shield = shield;
    }

    // TODO: Implement part 5.
    private void equipShield() {

    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public Armor getShield() {
        return shield;
    }

    @Override
    public void useAbility(Player target) {
    }

    @Override
    public void attack(Player target) {
    }
// TODO: Implement part 6.
}
