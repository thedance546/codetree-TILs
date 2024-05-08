import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum=0;
        for(int i=0; i<n; i++){
            int j=sc.nextInt();
            sum+=j;
        }
        double avg=sum/n;
        System.out.printf("%d %.1f",sum,avg);
    }
}