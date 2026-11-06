/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j2010 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a;
    
    static void in(){
        for(int i=1;i<=n;i++){
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
    
    static void swap(int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    static void solve(){
        n = sc.nextInt();
        a = new int[n+1];
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        int step =1;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(a[i] > a[j]){
                    swap(i,j);
                }
            }
            System.out.printf("Buoc %d: ",step++);
            in();
        }
    }
    public static void main(String[] args){
        solve();
    }
}
