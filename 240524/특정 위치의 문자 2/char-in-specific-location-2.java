import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[1]+" "+arr[4]+" "+arr[7]);


    }
}