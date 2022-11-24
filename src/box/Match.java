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
            while (this.f1.health > 0 && this.f2.health > 0) {
                this.f2.health = this.f1.hit(f2);
                this.f1.health = this.f2.hit(f1);
            }
        }else {
            System.out.println("The weight of selected fighters doesn't match!");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

}
