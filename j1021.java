package java_chuong_1;
import java.util.Scanner;

public class j1021 {
    static final long mod = (long) 1e9+7;
    static Scanner sc = new Scanner(System.in);
    public static long giai_thua(long a,long b){
        long tich=1;
        while(b>0){
            if(b%2==1){
                tich = (tich*a)%mod;
            }
            a=(a*a)%mod;
            b/=2;
        }
        return tich;
    }
    public static void solve(){
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==0 && b==0) break;
            else{
                System.out.println(giai_thua(a,b));
            }
        }
    }
    public static void main(String[] args){
        solve();
    }
}
