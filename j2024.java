package java_chuong_1.Java_c2;
import java.util.Scanner;
public class j2024 {
    static Scanner sc = new Scanner(System.in);
    
    static void solve(){
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
        }
        int found = 0;
        for(int i=1;i<n;i++){
            if(a[i] < a[i-1]){
                found = i;
                break;
            }
        }
        System.out.println(found);
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            solve();
        }
    }
}
