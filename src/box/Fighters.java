package box;

public class Fighters {
    String name;
    int damage;
    int health;
    int weight;

    Fighters(String name, int damage, int health, int weight) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

    }

    int hit(Fighters foe) {
        System.out.println(this.name + " ==>" + foe.name + " " + this.damage + " damage");
        if (foe.health - this.damage <= 0) {
            return 0;
        }
        return foe.health - this.damage;
    }
}
