package java_chuong_1.Java_c2;
import java.util.Scanner;
public class j2014 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a;

    static void nhap() {
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void solve(){
        n = sc.nextInt();
        a = new int[n+1];
        nhap();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum += a[i];
        }
        //
        int ans = -1;
        int leftsum=0;
        for(int i=1;i<=n;i++){
            int rightsum = sum - leftsum-a[i];
            if(leftsum==rightsum){
                ans = i;
                break;
            }
            leftsum+=a[i];
        }
        System.out.println(ans);   
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            solve();
        }
    }
}