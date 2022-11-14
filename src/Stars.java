import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter 'n' number: ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= (2 * i) - 1; p++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
