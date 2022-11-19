import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int number) {
        int temp = number;
        int reverseNumb = 0;
        int lastNumb;

        while (temp != 0) {
            lastNumb = temp %10;
            reverseNumb = (reverseNumb*10) +lastNumb;
            temp /=10;
        }
        if (reverseNumb==number){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the number you want to check: ");
        int check = inp.nextInt();
        System.out.println(isPalindrom(check));
    }
}
