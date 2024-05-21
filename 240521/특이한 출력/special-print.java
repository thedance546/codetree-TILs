import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k=3;

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (j==k) {
                    System.out.println("(" + i + ", " + j + ")");
                    k--;
                    if(k==0){
                        k=3;
                    }
                }
                else {
                    System.out.print("(" + i + ", " + j + ") ");
                }
            }
        }
    }
}