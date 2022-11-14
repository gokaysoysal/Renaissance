import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2, ebob;

        System.out.print("Please enter first number: ");
        n1 = inp.nextInt();
        System.out.print("Please enter second number: ");
        n2 = inp.nextInt();

        for (int i = n1; i>=0;i--){
            if (n1%i==0 && n2%i ==0){
                ebob = i;
                System.out.print("Ebob of selected numbers: " + ebob);
                break;
            }
        }
    }
}
