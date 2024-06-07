import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100]; 
        int[] countArr = new int[10]; //십의자리 1~9

        for (int i = 0; i < 100; i++) {
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            arr[i]=n;
        }

        // 개수 세기
        for (int i = 0; i < 100; i++) {
            countArr[arr[i]/10]++;
        }

        // 개수 출력
        for (int i = 1; i < 10; i++) {
            System.out.println(i+" - "+countArr[i]);
        }
    }
}