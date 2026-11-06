/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3031 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        boolean vs[] = new boolean[256];
        String s = sc.next();
        int K = sc.nextInt();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(!vs[s.charAt(i)]){
                vs[s.charAt(i)] = true;
                cnt++;
            }
        }
        if(s.length()>=26 && 26-cnt<=K){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            solve();
        }
    }
}
