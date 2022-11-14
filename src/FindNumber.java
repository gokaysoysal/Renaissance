import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numbers;
        int total = 1;
        int min = 0;
        int max = 0;

        System.out.print("How many numbers will you enter: ");
        numbers = inp.nextInt();

        while (total <= numbers) {
            if (numbers > 1) {
                System.out.print("Enter " + total + ". number: ");
                int n = inp.nextInt();
                if (n > min && n > max) {
                    max = n;
                    if (min == 0) {
                        min = n;
                    }
                }
                if (n < max && n < min) {
                    min = n;
                    if (max == 0) {
                        max = n;
                    }
                }
            }

            total++;
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
