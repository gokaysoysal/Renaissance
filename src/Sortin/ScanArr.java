package Sortin;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ScanArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        if (n <= 0) {
            System.out.println("The number you enter must be greater than 0");
        } else {
            int[] list = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Please enter " + i + "." + " index: ");
                list[i] = scan.nextInt();
            }
            Arrays.sort(list);
            System.out.print(Arrays.toString(list));
        }

    }
}
