package models.character;

public class Warrior extends GameCharacter {

    public Warrior(String name, float hp, float baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " chém bằng kiếm, gây " + getBaseDamage() + " sát thương.");
    }
}

