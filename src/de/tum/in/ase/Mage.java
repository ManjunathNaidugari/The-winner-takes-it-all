package de.tum.in.ase;

import java.util.List;

public class Mage extends Player{
    // TODO: Implement part 4.
    private List<Ability> abilities;

    public Mage(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "Mage", 5, armor, weapon, weaponType);
        this.abilities = abilities;
        strength = 2;
        intelligence = 10;
        agility = 4;
        spirit = 6;
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
