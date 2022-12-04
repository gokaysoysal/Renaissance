package Transpose;

public class Main {
    public static void main(String[] args) {
        int[][] list = {
                {1, 2, 3},
                {4, 5, 6}};
        int[][] transpose = new int[list[0].length][list.length];

        System.out.println("Array: ");
        for (int i = 0; i < list.length; i++) {
            for (int k = 0; k < list[0].length; k++) {
                System.out.print(list[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose: ");
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 2; k++) {
                transpose[i][k] = list[k][i];
                System.out.print(transpose[i][k] + " ");
            }
            System.out.println();
        }
    }
}
