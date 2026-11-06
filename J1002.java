/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1;
import java.util.Scanner;

public class J1002 {
    static Scanner sc = new Scanner(System.in);
    
    public static void solve(){
        long n = sc.nextLong();
        long sum= n*(n+1) / 2;
        System.out.println(sum);
    }
    
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            solve();
        }
    }
}
