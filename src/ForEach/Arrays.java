package ForEach;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]= 1;
        arr[1]= 3;
        arr[2]= 5;
        arr[3]= 7;
        arr[4]= 9;
        for (int count: arr){
            System.out.print(count + " ");
        }
    }
}
