package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j2034 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        int n = sc.nextInt();
        boolean[] vs = new boolean[1001];
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            vs[a[i]] = true;
        }
        int max_val = a[0];
        for(int i=0;i<n;i++){
            if(a[i] > max_val){
                max_val = a[i];
            }
        }
        boolean flag=false;
        for(int i=1;i<=max_val;i++){
            if(!vs[i]){
                flag = true;
                System.out.println(i);
            }
        }
        if(!flag) System.out.println("Excellent!");
    }
    public static void main(String[] args){
        solve();
    }
}
