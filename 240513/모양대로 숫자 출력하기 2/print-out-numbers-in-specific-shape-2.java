import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cnt*2+" ");
                cnt++;
                if(cnt>4){
                    cnt=1;
                }
            }
            System.out.println();
        }
    }
}