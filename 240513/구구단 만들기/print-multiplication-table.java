import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        for(int i = 1; i <= 9; i++) {
            
                for(int k=b; k>=2; k--){
                    System.out.print(k + " * " + i + " = " + (i * k));
                    k--;
                    if(k>2){
                    System.out.print(" / ");
                }
                }
                System.out.println();
                
            
        }
    }
}