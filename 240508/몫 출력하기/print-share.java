import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        
        for(int i=0; i<=3; i++){
            n=sc.nextInt();
            if(n%2==1){
                continue;
            } else{
               System.out.println(n/2);
            }
        }
    }
}