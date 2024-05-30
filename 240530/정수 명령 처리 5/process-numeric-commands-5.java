import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();

        for(int i=0; i<n; i++){
            String s = sc.next();
            switch(s){
                case "push_back":
                    l.add(sc.nextInt());
                    break;
                case "pop_back":
                    l.remove(l.size()-1);
                    break;
                case "size":
                    System.out.println(l.size());
                    break;
                case "get":
                    System.out.println(l.get(sc.nextInt()-1));
                    break;
                default :
                    System.out.println("error");
                    break;
                
            }
        }
    }
}