/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1;
import java.util.Scanner;

public class j1014 {
    static Scanner sc = new Scanner(System.in);
    public static void solve(long n){
        long max_val = 0;
        for(long i=2;i*i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    max_val = Math.max(max_val,i);
                    n/=i;
                }
            }
        }
        if(n>1) max_val = Math.max(max_val,n);
        System.out.println(max_val);
    }
    public static void main(String[] arsg){
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            solve(n);
        }
    }
}
