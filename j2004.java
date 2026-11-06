package java_chuong_1;
import java.util.Scanner;

public class j2004 {
    static Scanner sc = new Scanner(System.in);
    
    static void solve(){
        int n = sc.nextInt(); 
        int[] a = new int[n]; 
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        boolean check = true; 
        for(int i = 0; i < n / 2; i++){
            if(a[i] != a[n - 1 - i]){
                check = false;
                break; 
            }
        }
        
        if(check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
   
    public static void main(String[] args){
        int t = sc.nextInt(); 
        while(t-- > 0){
            solve();
        }
    }
}