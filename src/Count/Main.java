package Count;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] dup = {1, 1, 1, 1, 1, 1, 1, 1};
        int count = 1;

        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if (i != j && (list[i] == list[j])) {
                    count++;
                    dup[j] = 0;
                }
            }
            if (dup[i] != 0) {
                dup[i] = count;
            }
        }
        System.out.println("Array: " + Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            if (dup[i] != 0) {
                System.out.println("Number " + list[i] + " is repeated " + dup[i] + " times");
            }
        }
    }
}