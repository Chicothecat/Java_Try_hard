/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_chuong_1;
import java.util.Scanner;
       
/**
 *
 * @author ADMIN
 */
public class Java_chuong_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();
        if(a<=0 || b<=0){
            System.out.println(0);
        }else{
            int c = 2*(a+b);
            int s=  a*b;
            System.out.print(c +" "+s);
        }
    }
    
}
