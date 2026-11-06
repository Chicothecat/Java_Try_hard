/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1;
import java.util.Scanner;

public class j1009 {
    static Scanner sc = new Scanner(System.in);
    public static long solve(int n){
        long tich = 1;
        for(int i=1;i<=n;i++){
            tich *= i;
        }
        return tich;
    }
    public static void main(String[] args){
        int n = sc.nextInt();
        long sum = 0;
        for(int i=1;i<=n;i++){
            sum += solve(i);
        }
        System.out.println(sum);
    }   
}
