/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1.Java_c2;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class j2022_3 {
    static boolean[] vs = new boolean[15];
    static int n;
    static int saved[] = new int[15];
    static Scanner sc = new Scanner(System.in);
    
    static void in(){
        for(int i=1;i<=n;i++){
            System.out.printf("%d", saved[i]);
        }
        System.out.println();
    }
    
    static void back_track(int k){
        for(int i=1;i<=n;i++){
            if(!vs[i] && (k==1|| Math.abs(i-saved[k-1]) != 1)){
                saved[k] = i;
                vs[i] = true;
                if(k==n){
                    in();
                }
                else back_track(k+1);
                vs[i] = false;
            }
        }
    }
    static void solve(){
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            vs[i] = false;
        }
        back_track(1);
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            solve();
            System.out.println();
        }
    }
}
