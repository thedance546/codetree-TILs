import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char x = 'A';

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(x);
                x++;
                if((int) x==94){
                    x='A';
                }
            }
            System.out.println();
        }
    }
}