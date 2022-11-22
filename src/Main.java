public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi A7";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.increaseSpeed(30);
        audi.decreaseSpeed(15);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model = "BMW X6";
        bmw.speed = 20;
        bmw.increaseSpeed(15);
        bmw.increaseSpeed(15);
        bmw.decreaseSpeed(5);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = "Mercedes S600";
        mercedes.speed = 30;
        mercedes.increaseSpeed(10);
        mercedes.increaseSpeed(20);
        mercedes.decreaseSpeed(15);
        mercedes.printSpeed();
    }
}
