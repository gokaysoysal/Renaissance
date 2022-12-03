package Sortin;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list1 = new int[5];
        list1[0] = 99;
        list1[1] = -2;
        list1[2] = -2121;
        list1[3] = 1;
        list1[4] = 0;
        Arrays.sort(list1);

        System.out.println(Arrays.toString(list1));

        System.out.println("==================");
        int[] list2 = new int[6];
        list2[0] = 1000221;
        list2[1] = 22;
        list2[2] = -1;
        list2[3] = 999;
        list2[4] = 0;
        list2[5] = 254;
        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));
    }
}
