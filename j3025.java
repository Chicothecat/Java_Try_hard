package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3025 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        String s = sc.nextLine();
        int l =0, r=s.length()-1;
        int diff = 0;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                diff++;
            }
            l++;r--;
        }
        if(diff==1) System.out.println("YES");
        else if(diff==0){
            if(s.length() % 2==0) System.out.println("NO");
            else System.out.println("YES");
        }
        else System.out.println("NO");
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            solve();
        }
    }
}
