package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3021 {
    static Scanner sc = new Scanner(System.in);
    static boolean check(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    static char chuan_hoa(char c){
        if(c=='A'||c=='B'||c=='C'){
            return '2';
        }
        else if (c=='D'||c=='E'||c=='F'){
            return '3';
        }
        else if (c=='G'||c=='H'||c=='I'){
            return '4';
        }
        else if (c=='J'||c=='K'||c=='L'){
            return '5';
        }
        else if (c=='M'||c=='N'||c=='O'){
            return '6';
        }
        else if (c=='P'||c=='Q'||c=='R'||c=='S'){
            return '7';
        }
        else if (c=='T'||c=='U'||c=='V'){
            return '8';
        }else return '9';
    }
    static void solve(){
        
       String s = sc.nextLine().trim().toUpperCase();
       String ans="";
       for(int i=0;i<s.length();i++){
           char num = chuan_hoa(s.charAt(i));
           ans += num;
       }
       if(check(ans)){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            solve();
        }
    }
}
