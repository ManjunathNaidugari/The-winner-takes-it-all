package de.tum.in.ase;

public class Armor extends Item {
  // TODO: Implement part 2.
    private int amountOfArmor;


    public Armor(String armorType, String specification, int amountOfArmor, int strength, int intelligence, int agility, int spirit) {
        super(armorType);
        this.specification = specification;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.spirit = spirit;
        this.amountOfArmor = amountOfArmor;
    }


    public int getAmountOfArmor() {
        return amountOfArmor;
    }

    public void setAmountOfArmor(int amountOfArmor) {
        this.amountOfArmor = amountOfArmor;
    }
}
