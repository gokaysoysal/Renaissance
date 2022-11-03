import  java.util.Scanner;

public class PowersOfNumbers {
    public static void main(String[] args) {

        int i,k;
        int total = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        k = scan.nextInt();
        System.out.print("Enter a power: ");
        i = scan.nextInt();

        for (int m =1; m<= i;m++){
            total*=k;
        }
        System.out.println("Answer is: "+ total);
    }
}
