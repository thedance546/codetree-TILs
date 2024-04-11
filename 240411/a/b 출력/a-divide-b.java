import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = ((a%b)*10);
        int result=0;
        int c=0;
        
        System.out.print(a/b+".");
        for(int i=0; i<20; i++){
            System.out.print(d/b);
            c=d/b;
            result+=0.1*c;
            d=d%b*10;
        }

    }
}