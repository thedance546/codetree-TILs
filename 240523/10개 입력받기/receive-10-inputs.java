import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int cnt=0;
        int sum=0;

        for (int i = 0; i < 10; i++) {
            int n= sc.nextInt();
            if(n!=0){
                arr[i]=n; 
                sum+=arr[i];
                cnt++;
            } else{
                break;
            }
            
        }
        System.out.printf("%d %.1f",sum,(double)sum/cnt);

    }
}