
package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j2008 {
    static Scanner sc = new Scanner(System.in);
    static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static long bcnn(long a,long b){
        return (a/gcd(a,b))*b;
    }
    static void solve(){
        long[] ans = new long[105];
        ans[1] = 1;
        int n = sc.nextInt();
        
        for(int i=2;i<=100;i++){
            ans[i] = bcnn(ans[i-1],i);
        }
        System.out.println(ans[n]);        
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            solve();
        }
    }
}
