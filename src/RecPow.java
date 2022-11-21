import java.util.Scanner;

public class RecPow {
    static double power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Result: " + result);
        return result;
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter base number: ");
            int base = inp.nextInt();
            System.out.print("Please enter exp number: ");
            int exp = inp.nextInt();

            power(base, exp);
        }
    }

}

