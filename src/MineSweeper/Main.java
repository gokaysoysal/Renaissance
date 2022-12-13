package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row,col;
        System.out.print("Please enter row number: ");
        row = scan.nextInt();
        System.out.print("Please enter col number: ");
        col = scan.nextInt();
        MineSweeper mineSweeper = new MineSweeper(row,col);
        mineSweeper.run();

    }
}
