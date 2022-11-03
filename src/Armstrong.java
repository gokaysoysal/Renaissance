import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, tempNum, divNumber;
        int countNum = 0;
        int modNumber;
        int result=0;
        int powNumber;


        System.out.print("Enter a number: ");
        num = scan.nextInt();
        tempNum = num;

        while (tempNum != 0) {
            tempNum /= 10;
            countNum++;
        }
        tempNum = num;

        while(tempNum!=0){
            modNumber=tempNum%10;
            powNumber = 1;
            for (int i =1;i<=countNum;i++){
                powNumber*=modNumber;
            }
            result+=powNumber;

            tempNum/=10;

        }
        if (result==num){
            System.out.print(num + " is a armstrong number!");
        }else{
            System.out.print(num + " is not armstrong number!");
        }
    }
}
