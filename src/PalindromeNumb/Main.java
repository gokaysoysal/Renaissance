package PalindromeNumb;
import java.util.Scanner;
public class Main {
    static boolean isPalindrome(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0;i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the word you want to check: ");
        String check = scan.next();
        System.out.println(isPalindrome(check));
    }
}
