package GuessWhat;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);

        Scanner scan = new Scanner(System.in);
        int turn = 0;
        int[] wrong = new int[10];
        boolean isWin = false;

        while (turn < 5) {
            System.out.print("Tell me what you think from 0 to 100:\t");
            int select = scan.nextInt();

            if (select < 0 || select > 100) {
                System.out.println("Can you select from 0 to 100");
                continue;
            }
            if (select == number) {
                System.out.println(+number + "\t" + number + "\t" + number + "\t" + number + "\t" + number + "Congratulations!" + number + "\t" + number + "\t" + number + "\t" + number + "\t" + number);
                isWin = true;
                break;
            } else {
                System.out.println("Please try again:");
                if (select > number) {
                    System.out.println("Less");
                } else {
                    System.out.println("More");
                }
                wrong[turn] = select;
                turn++;
                System.out.println("Your right:\t" + (5 - turn));
            }
        }
        if (!isWin) {
            System.out.println("Game Over!");
        }
        System.out.println("The numbers you selected: " + Arrays.toString(wrong));
        System.out.println("The number is: " + " " + number);
    }
}
