package box;

public class Match {
    Fighters f1;
    Fighters f2;
    int minWeight;
    int maxWeight;

    Match(Fighters f1, Fighters f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            System.out.println(this.f1.name + " Health: " + this.f1.health + "  ----------  " + this.f2.name + " Health: " + this.f2.health);
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=== === === NEW ROUND === === ===");
                this.f2.health = this.f1.hit(f2);
                System.out.println(this.f2.name + " Health: " + this.f2.health);
                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                System.out.println(this.f1.name + " Health: " + this.f1.health);
                if (isWin()) {
                    break;
                }
            }
        } else {
            System.out.println("The weight of selected fighters doesn't match!");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " is Win!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " is Win!");
            return true;
        } else {
            return false;
        }
    }
}
