
import java.util.Scanner;

public class EvenNumberSort {
    public static void main(String[] args) {

        int i;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi Girin : ");
        i = inp.nextInt();

        for (int k = 1; k<=i; k++){
            if (k%2==0){
                System.out.println(k);
            }

        }

    }
}
