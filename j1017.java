
package java_chuong_1;
import java.util.Scanner;

public class j1017 {
    static Scanner sc = new Scanner(System.in);
    
    public static boolean check(String s){
        int n = s.length();
        for(int i=0;i<n-1;i++){
            int digit1 = s.charAt(i)-'0';
            int digit2 = s.charAt(i+1)-'0';
            if(Math.abs(digit1-digit2)!=1){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
