package java_chuong_1;
import java.util.Scanner;

public class j1006 {
    static Scanner sc = new Scanner(System.in);
    
    public static long solve(int n){
        if(n==1) return 1;
        if(n==2) return 1;
        long f1=1,f2=1,fn=0;
        for(int i=3;i<=n;i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return f2;
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){ 
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
}
