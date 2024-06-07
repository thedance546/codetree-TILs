import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        
        for (int i = 0; i < 100; i++) {
            int n = sc.nextInt();
            if(n%2==1){
                arr[i]=(n+3);
            } else if(n%2==0 && n!=0){
                arr[i]=(n/2);
            } else{
                break;
            }
            System.out.print(arr[i]+" ");
        }

        
        
        
    }
}