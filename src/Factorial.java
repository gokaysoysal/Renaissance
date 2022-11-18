import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int total = 1;

        System.out.print("Please enter factorial number: ");
        int fac = inp.nextInt();

        for (int i = 1; i <= fac; i++) {
            total = (total * i);
        }
        System.out.print(total);
    }
}
