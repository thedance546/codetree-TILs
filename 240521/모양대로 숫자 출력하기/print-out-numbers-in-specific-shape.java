import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k=1;

        for (int i = n; i>=1; i--) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((i-j)+" ");
            }
            System.out.println();
        }
    }
}