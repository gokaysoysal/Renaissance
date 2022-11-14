import java.util.Scanner;

public class Excellent {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int total = 0;
        int temp;

        System.out.print("Please enter a number: ");
        int number = inp.nextInt();
        temp = number;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == temp) {
            System.out.print(temp + " is a excellent number.");
        } else
            System.out.print(temp + " is not excellent number");
    }
}
