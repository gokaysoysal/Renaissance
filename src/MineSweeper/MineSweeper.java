package MineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumb, colNumb, size;
    int[][] map;
    int[][] board;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNumb, int colNumb) {
        this.rowNumb = rowNumb;
        this.colNumb = colNumb;
        this.size = rowNumb * colNumb;
        this.map = new int[rowNumb][colNumb];
        this.board = new int[rowNumb][colNumb];

    }

    public void run() {
        prepareGame();
        print(map);

    }

    public void prepareGame() {
        int randRow, randCol, count = 0;
        while (count <= (size / 4)) {
            randRow = rand.nextInt(rowNumb);
            randCol = rand.nextInt(colNumb);
            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
