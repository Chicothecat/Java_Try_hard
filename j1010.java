/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1;
import java.util.Scanner;

public class j1010 {
    static Scanner sc = new Scanner(System.in);
    public static void solve(){
        String s = sc.next();
        boolean check = true;
        String res = "";
        for(char c : s.toCharArray()){
            if(c=='0') res+= '0';
            else if(c=='1') res+='1';
            else if(c=='8') res+='0';
            else if(c=='9') res+='0';
            else{
                check = false;
                break;
            }
        }
        if(!check){
            System.out.println("INVALID");
            return;
        }
        int i =0;
        while(i<res.length() && res.charAt(i)=='0'){
            i++;
        }
        if(i==res.length()){
            System.out.println("INVALID");
        }else{
            System.out.println(res.substring(i));
        }
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            solve();
        }
    }
}
