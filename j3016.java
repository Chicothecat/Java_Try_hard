package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3016 {
    static Scanner sc = new Scanner(System.in);
    
    static long du(String s,int m){
        long tmp = 0;
        for(int i=0;i<s.length();i++){
            tmp = tmp*10+(s.charAt(i)-'0');
            tmp = tmp % m;
        }
        return tmp;
    }
    
    static void solve(){
        String s = sc.nextLine().trim();
        if(du(s,11)==0) System.out.println("1");
        else System.out.println("0");
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            solve();
        }
    }
}
