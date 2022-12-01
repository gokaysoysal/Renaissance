import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] list = {234, 53, 57, 856, 324, 64, 8, 3, 4, 32, -5, 0, 12, 2356};
        Arrays.sort(list);
        System.out.println("Min: " + list[0]);
        System.out.println("Max: " + list[list.length - 1]);

        System.out.println("=====================");

        int[] list2 = {0, 345, 345, 123, 35, 64, 12, 4, 6, -34, -46, -32, 4634};
        int min = list2[0];
        int max = list2[0];

        for (int i : list2) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}