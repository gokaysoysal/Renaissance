package MineSweeper;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumb, colNumb, size;
    int[][] map;
    int[][] board;
    boolean isWin = false;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNumb, int colNumb) {
        this.rowNumb = rowNumb;
        this.colNumb = colNumb;
        this.size = rowNumb * colNumb;
        this.map = new int[rowNumb][colNumb];
        this.board = new int[rowNumb][colNumb];
    }

    //OYUN BAŞLATMA
    public void run() {
        int row, col;
        int finish = 0;
        prepareGame();
        print(map);
        System.out.println("The game has start");
        while (!isWin) {
            print(board);
            System.out.print("Select row coordinate: ");
            row = scan.nextInt();
            row = rowControl(row, scan);

            System.out.print("Select column coordinate: ");
            col = scan.nextInt();
            col = colControl(col, scan);
            if (map[row][col] != -1) {
                check(row, col);
                finish++;
                if (finish - (size / 4) == 0) {
                    System.out.println("Congratulations!");
                }
            } else {
                isWin = false;
                System.out.println("Game Over!");
            }
        }
    }
    // SATIR KONTROL
    public int rowControl(int rowCont, Scanner scan) {
        while ((rowCont >= this.rowNumb) || (rowCont < 0)) {
            System.out.println("Please enter 0-" + this.rowNumb + ":\t");
            rowCont = scan.nextInt();
        }
        return rowCont;
    }

    // SÜTUN KONTROL
    public int colControl(int colCont, Scanner scan) {
        while ((colCont >= this.colNumb) || (colCont < 0)) {
            System.out.print("Plese enter 0-" + this.colNumb + ":\t");
            colCont = scan.nextInt();
        }
        return colCont;
    }

    // MAYIN KONTROL
    public void check(int row, int col) {
        if (map[row][col] == 0) {
            if ((col < colNumb - 1) && (map[row][col + 1] == -1)) {
                board[row][col]++;
            }
            if ((row < rowNumb - 1) && (map[row + 1][col] == -1)) {
                board[row][col]++;
            }
            if ((col > 0) && (map[row][col - 1] == -1)) {
                board[row][col]++;
            }
            if ((row > 0) && (map[row - 1][col] == -1)) {
                board[row][col]++;
            }
            if (board[row][col] == 0) {
                board[row][col] = 5;
            }
        }
    }

    //MAYIN DAĞITIM
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

    //MAP GÖRÜNÜM
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
