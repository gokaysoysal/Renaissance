import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        int k;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number\t: ");
        k = inp.nextInt();

        for (int i = 2; i <= k; i*=2) {
            System.out.println(i);
        }

    }
}
