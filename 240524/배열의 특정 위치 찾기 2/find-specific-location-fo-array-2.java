import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sumE=0;
        int sumO=0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if(i%2==0){
                sumO+=arr[i];
            } else{
                sumE+=arr[i];
            }
        }
        int answer = (sumE>sumO ? sumE-sumO : sumO-sumE);
        System.out.println(answer);

    }
}