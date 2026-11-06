package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3006 {
    static Scanner sc = new Scanner(System.in);
    static boolean check1(String s){
        int l = 0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }
    static boolean check2(String s){
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check1(s) && check2(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
