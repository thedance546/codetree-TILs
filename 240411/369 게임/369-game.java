import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num =i;
            int lastDigit =num%10;
            if(i%3==0){
                System.out.print("0 ");
            } else if(lastDigit ==3 || lastDigit ==6 || lastDigit ==9) {
                System.out.print("0 ");
                num/=10;
            } else {
                System.out.print(i+" ");
            }
            
        }

        
    }
}