import java.util.Scanner;

public class Calculator {
    static int sum (int a, int b){
        int result = a + b;
        System.out.println("Sum: " +result);
        return result;
    }
    static int minus(int a,int b){
        int result = a-b;
        System.out.println("Minus: " + result);
        return  result;
    }
    static int times(int a, int b){
        int result = a*b;
        System.out.println("Times: " + result);
        return result;
    }
    static int divided(int a, int b){
        int result = a/b;
        System.out.println("Divided: " + result);
        return result;
    }
    static int power(int a, int b){
        int result=1;
        for (int i =1; i<=b;i++){
            result *=a;
        }
        System.out.println("Power: "+ result);
        return result;
    }
    static int mod (int a,int b){
        int result = a%b;
        System.out.println("Mod: "+ result);
        return result;
    }
    static void rectangle(int a, int b){
        System.out.println("Area: "+ (2*(a+b)) +"\nPerimeter: " + (a*b));
    }


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String menu = "\n"
                + "1- Sum\n"
                + "2- Minus\n"
                + "3- Times\n"
                + "4- Divided\n"
                + "5- Power\n"
                + "6- Mod\n"
                + "7- Rectangle area and perimeter\n"
                + "0- Quit\n";


        System.out.println(menu);
        while (true) {
            System.out.println("=========================");
            System.out.print("Choose action: ");
            int select = inp.nextInt();

            if (select==0){
                System.out.print("Güle Güle!");
                break;
            }
            System.out.print("Enter first number: ");
            int a = inp.nextInt();
            System.out.print("Enter second number: ");
            int b = inp.nextInt();

            switch (select){
                case 1:
                    sum (a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    rectangle(a,b);
                    break;
                default:
                    System.out.print("ERROR!");
            }

        }
    }
}
