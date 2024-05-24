import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int sumE= 0;
        int sum3=0;
        int cnt=0;

        for (int i = 0; i < 10; i++) {
            int n=sc.nextInt();
            if(i%2==1){
                sumE+=n;
            }
            if(i==2||i==5||i==8){
                sum3+=n;
                cnt++;
            }
        }

        System.out.printf("%d %.1f",sumE,(double)sum3/cnt);
    }
}