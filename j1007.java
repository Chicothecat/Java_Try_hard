/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1;
import java.util.Scanner;

public class j1007 {
    static Scanner sc = new Scanner(System.in);
    public static boolean check(long n){
        if(n==1||n==2||n==0) return true;
        long f1=1,f2=1,fn=0;
        while(f2<n){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return (f2==n);
    }
    public static void solve(){
        long n = sc.nextLong();
        if(check(n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            solve();
        }
    }
}
