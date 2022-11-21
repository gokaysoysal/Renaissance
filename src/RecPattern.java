import java.util.Scanner;

public class RecPattern {
    static void pat(int number) {
        int temp = number;
        while (temp > 0) {
            System.out.print(temp + " ");
            temp -= 5;

            if (temp <= 0) {
                for (int i = temp; i <= number; i += 5) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int number = inp.nextInt();
            pat(number);
        }
    }
}