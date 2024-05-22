import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int cntt=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    cntt++;
                }
            }
            if(cntt==2){
                System.out.print(i+" ");
            }
            
        }
    
    }
}