import java.util.Scanner;

public class PowersOfNumbersWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m, k;
        int total = 1;
        System.out.println("enter a sub: ");
        m = scan.nextInt();
        System.out.println("enter a sup: ");
        k = scan.nextInt();

        int i = 1;
        while (i <= k) {
            total*=m;
            i++;
        }
        System.out.println("answer is: "+ total);

    }
}
