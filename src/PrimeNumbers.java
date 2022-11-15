import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        boolean isAsal = true;

        System.out.print("2 ");

        for (int i = 3; i <= 100; i++) {
            isAsal = true;

            for (int m = 2; m < i; m++) {
                if (i % m == 0) {
                    isAsal = false;
                }
            }

            if (isAsal) {
                System.out.print(i + " ");
            }
        }
    }
}

