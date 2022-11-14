import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;
        int turn = 3;
        int select;
        int balance = 15000;

        while (turn > 0) {
            System.out.print("Enter your Username : ");
            userName = inp.nextLine();
            System.out.print("Enter your password : ");
            password = inp.nextLine();
            if (userName.equals("gokay") && password.equals("soysal")) {
                System.out.println("Successful entry. Welcome BunnyBank, dear " + userName + password);
                do {
                    System.out.println("-------------------------------------------------");
                    System.out.println("1- Deposit\n" + "2- Withdraw\n" + "3- Remainder\n" + "4- Quit");
                    System.out.println("Please select your action.");
                    select = inp.nextInt();

                    if (select == 1) {
                        System.out.print("Enter deposit price: ");
                        int priceD = inp.nextInt();
                        balance += priceD;
                        System.out.println("Account balance is: " + balance);
                    } else if (select == 2) {
                        System.out.print("Enter withdraw price: ");
                        int priceW = inp.nextInt();

                        if (balance < priceW) {
                            System.out.print("Insufficient balance!");
                        } else {
                            balance -= priceW;
                            System.out.println("Account balance is: " + balance);
                        }
                    } else if (select == 3) {
                        System.out.println("Your account balance: " + balance);
                    }
                } while (select != 4);
                break;
            } else {
                turn--;
                if (turn == 0) {
                    System.out.println("Your account has been blocked by the bank.");
                } else {
                    System.out.println("You entered incorrectly, try again." + " Your remaining right: " + turn);
                }
            }
        }
    }
}
