import java.util.Scanner;

public class Down {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter steps number: ");
        int number = inp.nextInt();

        for (int i = number; i > 0; i--) {
            for (int n = 1; n <= (number - i); n++) {
                System.out.print(" ");
            }
            for (int m = ((i * 2) - 1); m > 0; m--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
