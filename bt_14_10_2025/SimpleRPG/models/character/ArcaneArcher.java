package models.character;

import models.abilities.CastSpell;
import models.abilities.RangeAttack;

public class ArcaneArcher extends GameCharacter implements RangeAttack, CastSpell {

    public ArcaneArcher(String name, float hp, float baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        shootArrow();
        castSpell();
    }

    @Override
    public void shootArrow() {
        System.out.println(getName() + " bắn mũi tên ma thuật, gây " + (getBaseDamage() * 1.2f) + " sát thương.");
    }

    @Override
    public void castSpell() {
        System.out.println(getName() + " niệm bùa hỗ trợ, cộng dồn sát thương " + (getBaseDamage() * 0.5f) + ".");
    }
}
