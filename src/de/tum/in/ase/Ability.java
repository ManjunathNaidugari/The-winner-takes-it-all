package de.tum.in.ase;

public class Ability {
    // TODO: Implement part 1.
    private String name;
    private String specification;
    private int damage;
    private int heal;
    private int armor;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Ability(String name, String specification, int amount) {
        this.name = name;
        this.specification = specification;
        switch (specification) {
            case ("Mage"):
                this.damage = amount;
                heal = -1;
                armor = -1;

            case ("Tank"):
                armor = amount;
                heal = -1;
                damage = -1;

            case ("Healer"):
                heal = amount;
                damage = -1;
                armor = -1;

            case ("Warrior"):
                damage = amount;
                heal = -1;
                armor = -1;

            default:
                System.out.println("Please give right name like Mage, Tank, Healer, Warrior.");
        }


    }
}
