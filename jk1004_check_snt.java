/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1;
import java.util.Scanner;

public class jk1004_check_snt {
    static Scanner sc = new Scanner(System.in);
    public static boolean check(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void solve(){
        int n = sc.nextInt();
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
