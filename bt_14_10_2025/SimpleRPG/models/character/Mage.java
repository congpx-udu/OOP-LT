package models.character;
import models.abilities.CastSpell;

public class Mage extends GameCharacter implements CastSpell {

    public Mage(String name, float hp, float baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        castSpell();
    }

    @Override
    public void castSpell() {
        System.out.println(getName() + " tung phép thuật, gây " + (getBaseDamage() * 1.5f) + " sát thương phép.");
    }
}

