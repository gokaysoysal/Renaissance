class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model, int speed, String color){
        this.type = "Sedan";
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.speedLimit = 200;
    }

    void increaseSpeed (int increment) {
        if((this.speed + increment)< this.speedLimit){
            this.speed+=increment;
        }
    }
    void decreaseSpeed (int decrease){
        if ((this.speed - decrease)>0){
            this.speed-=decrease;
        }
    }

    void printSpeed(){
        System.out.println(this.model + " Speed: " + this.speed);
    }
    void printInfo(){
        System.out.println("Type\t: " + this.type);
        System.out.println("Model\t: " + this.model);
        System.out.println("Color\t: " + this.color);
        System.out.println("Speed\t: " + this.speed);
        System.out.println("===========================");
    }
}