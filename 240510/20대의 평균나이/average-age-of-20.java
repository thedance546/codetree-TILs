import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int sum=0;
        int n=0;
        double avg;
        
        while(true){
            a=sc.nextInt();
            if(a>=30){
                break;
            }
            sum+=a;
            n++;
        }

        avg=(double) sum/n;
        System.out.printf("%.2f",avg);
    }
}