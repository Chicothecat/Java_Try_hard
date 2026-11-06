
package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j2007 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a;
    static int dem(int x){
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(x==a[i]){
                cnt++;
            }
        }
        return cnt;
    }
    static void solve(){
        n = sc.nextInt();
        a = new int[n+1];
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        boolean vs[] = new boolean[10001];
        for(int i=1;i<=n;i++){
            if(!vs[a[i]]){
                int cnt = dem(a[i]);
                vs[a[i]] = true;
                System.out.printf("%d xuat hien %d lan\n",a[i],cnt);
            }
        }
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            System.out.printf("Test %d:\n",i);
            solve();
        }
    }
}
