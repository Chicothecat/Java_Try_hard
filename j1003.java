/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1;
import java.util.Scanner;

public class j1003 {
    static Scanner sc = new Scanner(System.in);
    public static void solve(){
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("VSN");
            }else{
                System.out.println("VN");
            }
        }else{
            float x = -b / a;
            System.out.printf("%.2f\n",x);
        }
    }
    public static void main(String[] args){
        solve();
    }
}
