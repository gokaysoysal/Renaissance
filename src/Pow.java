import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int base, exp;
        int total = 1;


        System.out.print("Please enter base: ");
        base = inp.nextInt();
        System.out.print("Plese enter exp: ");
        exp = inp.nextInt();

        for (int i = 1; i <= exp; i++) {
            total *= base;
        }
        System.out.println(total);
    }

}
