import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sumVal = 0;
        while (true) {
            n = sc.nextInt();
            System.out.println(n);
            if (n == 0) {
                break;
            }
        }
    }
}