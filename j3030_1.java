/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3030_1 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        int dpA=0;
        int dpB=0;
        String s = sc.nextLine();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            int prevA = dpA;
            int prevB=dpB;
            
            if(c=='A'){
                dpA=prevA;
                dpB=Math.min(prevB+1,prevA+1);
            }
            else{
                dpB = prevB;
                dpA=Math.min(prevB+1,prevA+1);
            }
        }
        System.out.println(dpA);
    }
    public static void main(String[] args){
        solve();
    }
}
