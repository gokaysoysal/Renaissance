import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {

        int n;
        int total = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Enter a number\t: ");
            n = inp.nextInt();

            if (n % 2 == 1) {
                total += n;
            }
        }
        while (n > 0);

        System.out.print("Total\t: " + total);
    }
}
