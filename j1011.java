package java_chuong_1;
import java.util.Scanner;

public class j1011 {
    static Scanner sc = new Scanner(System.in);
    public static long ucln(long a,long b){
        while(b>0){
            long tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static long bcnn(long a, long b){
        return (a/ucln(a,b))*b;
    }
    public static void solve(){
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.printf("%d %d",bcnn(a,b),ucln(a,b));
        System.out.println();
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            solve();
        }
    }
}
