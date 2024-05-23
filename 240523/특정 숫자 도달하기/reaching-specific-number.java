import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int n=0;
        int sum=0; 

        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>=250){
                break;
            }
            sum+=arr[i];
            n++;
        }
        System.out.printf("%d %.1f",sum,(double)sum/n);
    }
}