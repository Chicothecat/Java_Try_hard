package java_chuong_1.Java_c2;
import java.util.Scanner;
import java.util.Arrays; 

public class j2005 {
    static Scanner sc = new Scanner(System.in);
    
    static void solve(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[n+1];
        int[] b = new int[m+1];

        boolean[] vs = new boolean[1000005]; 
        
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
            vs[a[i]] = true; 
        }
        
        for(int i = 1; i <= m; i++){
            b[i] = sc.nextInt();
        }
        
        Arrays.sort(b, 1, m + 1);
        
        for(int i = 1; i <= m; i++){
            if(vs[b[i]]){
                System.out.printf("%d ", b[i]); 
                vs[b[i]] = false;  
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        solve();
    }
}