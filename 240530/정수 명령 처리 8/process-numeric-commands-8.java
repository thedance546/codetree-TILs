import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();

        for(int i=0; i<n; i++){
            String s = sc.next();
            switch(s){
                case "push_front":
                    ll.addFirst(sc.nextInt());
                    break;
                case "push_back":
                    ll.addLast(sc.nextInt());
                    break;
                case "pop_front":
                    System.out.println(ll.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(ll.pollLast());
                    break;
                case "size":
                    System.out.println(ll.size());
                    break;
                case "empty":
                    if(ll.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "front":
                    System.out.println(ll.peekFirst());
                    break;
                default :
                    System.out.println(ll.peekLast());
                    break;
                
            }
        }
    }
}