package java_chuong_1.Java_c2;
import java.util.Scanner;
import java.util.Vector;
public class j2036 {
    static Scanner sc = new Scanner(System.in);
    static int ucln(int a,int b){
        while(b>0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    static int bcnn(int a,int b){
        return (a/ucln(a,b))*b;
    }
    static void solve(){
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Vector<Integer> b = new Vector<>();
        // 
        b.add(a[0]);
        for(int i=1;i<n;i++){
            b.add(bcnn(a[i-1],a[i]));
        }
        b.add(a[n-1]);
        for(int x : b) System.out.printf("%d ",x);
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            solve();
            System.out.println();
        }
    }
}
