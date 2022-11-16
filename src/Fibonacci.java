import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number, n4;
        int n1 = 0;
        int n2 = 1;

        System.out.print("Please enter a fibonacci number: ");
        number = inp.nextInt();

        System.out.print(n1 + " ");
        System.out.print(n2 + " ");

        for (int i = 2; i <= number; i++) {
            n3 = n1 + n2;
            System.out.print(n4 + " ");

            n1 = n2;
            n2 = n4;

        }
    }
}
