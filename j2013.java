
package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j2013 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a;
    static void nhap(){
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
    }
    static void in(){
        for(int i=1;i<=n;i++){
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
    static void swap(int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    static void solve(){
        n = sc.nextInt();
        a = new int[n+1];
        nhap();
        int step = 1;
        for(int i=1;i<=n-1;i++){
            boolean check_swap = true;
            for(int j=1;j<=n-i;j++){
                if(a[j] > a[j+1]){
                   swap(j,j+1);
                   check_swap = false;
                }
            }
            if(check_swap) break;
            System.out.printf("Buoc %d: ",step++);
            in();
        }
    }
    public static void main(String[] args){
        solve();
    }
}
