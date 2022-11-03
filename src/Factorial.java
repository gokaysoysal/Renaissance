import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int total = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter target factorial number: ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            total = total * i;


        }
        System.out.println(n+". Factorial is = " + total);
    }
}
