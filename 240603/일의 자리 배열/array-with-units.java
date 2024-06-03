import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[11];

        arr[1]=a;
        arr[2]=b;

        for (int i = 3; i < 11; i++) {
            arr[i]=(arr[i-2]+arr[i-1])%10;
        }

        for(int j=1; j<11; j++){
            System.out.print(arr[j]+" ");
        }
    }
}