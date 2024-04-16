import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int cnt1=0; //윤년
        int cnt2=0; //평년

        for (int i = 1; i <= n; i++) {
            if(i%4==0){
                if(i%100==0 && i%400!=0){
                    cnt2++;
                } else{
                    cnt1++;
                }
            }
        }

        System.out.println(cnt1);
    }
}