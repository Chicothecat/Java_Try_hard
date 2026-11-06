/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1.Java_c2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class j2006 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n+1];
        int b[] = new int[m+1];
        ArrayList<Integer> v = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=1;i<=m;i++){
            b[i] = sc.nextInt();
        }
        boolean[] vs = new boolean[10001];
        for(int i=1;i<=n;i++){
            if(!vs[a[i]]){
                vs[a[i]] = true;
                v.add(a[i]);
            }
        }
        for(int i=1;i<=m;i++){
            if(!vs[b[i]]){
                vs[b[i]] = true;
                v.add(b[i]);
            }
        }
        Collections.sort(v);
        for(int x : v){
            System.out.printf("%d ", x);
        }
        System.out.println();
    }
    public static void main(String[] args){
        solve();
    }
}
