package java_chuong_1;
import java.util.Scanner;

public class j013 {
    static Scanner sc = new Scanner(System.in);
    public static void solve(long n){
        int cnt = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i%2==0){
                    cnt++;
                }
                long j = n/i;
                if(i*i!=n &&j%2==0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextInt();
            solve(n);
        }
    }
}
