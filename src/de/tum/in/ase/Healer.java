package de.tum.in.ase;

import java.util.List;

public class Healer extends Player {
    // TODO: Implement part 4.
    private List<Ability> abilities;

    public Healer(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "Healer", 9, armor, weapon, weaponType);
        this.abilities = abilities;
        strength = 3;
        intelligence = 5;
        agility = 3;
        spirit = 10;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    @Override
    public void useAbility(Player target) {
    }

    @Override
    public void attack(Player target) {
    }
// TODO: Implement part 5.

    // TODO: Implement part 6.
}
