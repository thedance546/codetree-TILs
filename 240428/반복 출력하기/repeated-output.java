import java.util.Scanner;

public class Main {

 

    public static void printNLines(int N){
        for(int i=0; i<N; i++){
            System.out.println("12345^&*()_");
        }
        
    }

    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
        printNLines(N);
    }
}