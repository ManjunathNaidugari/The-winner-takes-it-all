package de.tum.in.ase;

import java.util.List;

public class Warrior extends Player {
    // TODO: Implement part 4.
    private List<Ability> abilities;

    public Warrior(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "Warrior", 15, armor, weapon, weaponType);
        this.abilities = abilities;
        strength = 20;
        intelligence = 2;
        agility = 8;
        spirit = 2;
    }

    // TODO: Implement part 5.

    public List<Ability> getAbilities() {
        return abilities;
    }

    @Override
    public void useAbility(Player target) {
    }

    @Override
    public void attack(Player target) {
    }
    // TODO: Implement part 6.
}
