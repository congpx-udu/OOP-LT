package models.character;

public abstract class GameCharacter {
    private String name;
    private float hp;
    private float baseDamage;

    public GameCharacter(String name, float hp, float baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public String getName() { return name; }
    public float getHp() { return hp; }
    public float getBaseDamage() { return baseDamage; }

    public void setName(String name) { this.name = name; }
    public void setHp(float hp) { this.hp = hp; }
    public void setBaseDamage(float baseDamage) { this.baseDamage = baseDamage; }

    public abstract void attack();
}
