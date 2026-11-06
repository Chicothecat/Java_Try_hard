/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1.Java_c2;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class j3010 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> dd = new ArrayList<>();
        while(n-->0){
            String[] ar = sc.nextLine().trim().toLowerCase().split("\\s+");
            String s = ar[ar.length-1];
            for(int i=0;i<ar.length-1;i++){
                s+=ar[i].charAt(0);
            }
            dd.add(s);
            int cnt = Collections.frequency(dd, s);
            s+=(cnt == 1? "" : cnt) + "@ptit.edu.vn";
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        solve();
    }
}
