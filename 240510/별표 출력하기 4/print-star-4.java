import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cnt = n;
        for (int i = 0; i <(2*n-1) ; i++) {
            for (int j = cnt; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();

            if (i < n-1) {
                cnt--;
            }
            else {
                cnt++;
            }
        }
    }
}