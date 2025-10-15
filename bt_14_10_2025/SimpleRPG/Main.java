import models.character.*;


public class Main {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior("Thorin", 150, 25);
        GameCharacter archer = new Archer("Legolas", 100, 20);
        GameCharacter mage = new Mage("Gandalf", 90, 30);
        GameCharacter arcaneArcher = new ArcaneArcher("Sylvanas", 110, 22);

        System.out.println("=== Bắt đầu trận đấu ===");
        warrior.attack();
        archer.attack();
        mage.attack();
        arcaneArcher.attack();
    }
}

