package models.character;

import models.abilities.RangeAttack;

public class Archer extends GameCharacter implements RangeAttack {

    public Archer(String name, float hp, float baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        shootArrow();
    }

    @Override
    public void shootArrow() {
        System.out.println(getName() + " bắn một mũi tên, gây " + getBaseDamage() + " sát thương.");
    }
}
