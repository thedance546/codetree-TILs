import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr = new int[4];

        int sum = 0;
        int cnt=0;

        for(int i = 0; i < n; i++){
            for(int j=0; j<4; j++){
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            
            if(sum/4>=60){
                System.out.println("pass");
                cnt++;
            } else{
                System.out.println("fail");
            }
            sum=0;
        }

        System.out.print(cnt);
    }
}