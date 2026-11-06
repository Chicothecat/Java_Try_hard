/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1;
import java.util.Scanner;

public class j1008 {
    static Scanner sc = new Scanner(System.in);
    public static void solve(long n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                int cnt = 0;
                while(n%i==0){
                    cnt++;
                    n/=i;
                }
                System.out.printf(" "+ i + "("+cnt+")" );
            }
        }
        if(n>1) System.out.printf(" " + n +"(1)");
        System.out.println();
    }
    public static void main(String[] args){
        if(sc.hasNextInt()){
            int t =sc.nextInt();
            for(int test = 1;test <=t;test++){
                long n = sc.nextLong();
                System.out.print("Test "+test+":");
                solve(n);
            }
        }
    }
}
