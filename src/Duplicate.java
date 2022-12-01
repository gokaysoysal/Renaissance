import java.util.Arrays;

public class Duplicate {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 5, 7, 8, 9, 0, 6, 7, 5, 3, 5, 6};
        int[] dup = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind((dup), list[i])) {
                        dup[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int count : dup) {
            if (count != 0) {
                System.out.println(count);
            }
        }
    }
}
