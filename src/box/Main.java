package box;

public class Main {
    public static void main(String[] args) {

        Fighters f1 = new Fighters("A", 25, 120, 100);
        Fighters f2 = new Fighters("B", 15, 105, 95);

        Match match = new Match(f1, f2, 80, 100);
        match.run();


    }
}
