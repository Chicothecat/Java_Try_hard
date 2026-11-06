
package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j2011 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a;
    
    static void nhap(){
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
    }
    
    static void in(int idx){
        for(int i=1;i<=idx;i++){
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
    static void solve(){
        n = sc.nextInt();
        a = new int[n+1];
        nhap();
        int pos,tmp;
        int step = 0;
        System.out.printf("Buoc 0: ");
        in(1);
        for(int i=2;i<=n;i++){
            tmp = a[i]; // tmp luu vi tri a[i] hien tai
            pos = i; // luu idx hien tai
            while(pos>0 && tmp<a[pos-1]){
                a[pos] = a[pos-1];
                pos--;
            }
            a[pos] = tmp;
            System.out.printf("Buoc %d: ",i-1);
            in(i);
        }
    }
    public static void main(String[] args){
        solve();
    }  
}
