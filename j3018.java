/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3018 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        String n = sc.nextLine();
        int len = n.length();
        int du = 0;
        if(len==1){
            du = n.charAt(0)-'0';
        }else{
            du += (n.charAt(len-2)-'0')*10 + n.charAt(len-1)-'0';
        }
        if(du%4==0) System.out.println("4");
        else System.out.println("0");
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            solve();
        }
    }
}
