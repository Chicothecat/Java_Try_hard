package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3036 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n = s1.length();
        int m = s2.length();
        if(n==m){
            if(s1.equals(s2)) System.out.println("-1");
            else{
                System.out.println(n);
            }
        }
        else if(n>m){
            System.out.println(n);
        }
        else System.out.println(m);
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            solve();
        }
    }
}
