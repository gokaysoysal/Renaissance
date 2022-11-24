package box;

public class Fighters {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighters(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighters foe) {
        System.out.println(this.name + "  ===>  " + foe.name + "  " + this.damage + " received damage");
        if (foe.isDodge()) {
            System.out.println(foe.name + " is blocked attack!");
            return foe.health;
        }
        if (foe.health - this.damage <= 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
