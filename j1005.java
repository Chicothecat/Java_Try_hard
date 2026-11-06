/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1;
import java.util.Scanner;

public class j1005 {
    static Scanner sc = new Scanner(System.in);
    public static void solve(){
        int n = sc.nextInt();
        int h = sc.nextInt();
     
        for(int i=1;i<=n-1;i++){
           double hi = h * Math.sqrt((double)i/n);
           System.out.printf("%.6f ",hi);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            solve();
        }
    }
}
