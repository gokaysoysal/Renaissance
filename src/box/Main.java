package box;

public class Main {
    public static void main(String[] args) {

        Fighters f1 = new Fighters("Jack", 25, 120, 100, 50);
        Fighters f2 = new Fighters("Daniel", 15, 107, 90, 50);

        Match match = new Match(f1, f2, 80, 100);
        match.run();


    }
}
