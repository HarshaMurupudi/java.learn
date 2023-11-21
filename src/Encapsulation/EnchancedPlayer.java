package Encapsulation;

public class EnchancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnchancedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public EnchancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health <= 0) {
            this.health = 1;
        } else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return health;
    }
}
