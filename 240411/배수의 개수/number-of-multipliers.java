import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        for (int i = 0; i <= 9; i++) {
            int a = sc.nextInt();
            if(a%3==0 || a%5==0){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}