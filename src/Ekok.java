import java.util.Scanner;

public class Ekok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1, n2, ekok;

        System.out.print("Please enter first number: ");
        n1 = inp.nextInt();
        System.out.print("Please enter second number: ");
        n2 = inp.nextInt();

        for (int i =n1; i<= n1*n2;i++){
            if (i%n1==0 && i%n2==0){
                ekok = i;
                System.out.print("Ekok of selected numbers: " + ekok);
                break;
            }
        }
    }
}
