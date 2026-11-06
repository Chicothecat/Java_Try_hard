package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3008 {
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
        int max_len = 1001;
        boolean[] is_prime = new boolean[max_len+1];
        
        for(int i=0;i<=max_len;i++){
            is_prime[i] = true;
        }
        is_prime[0] = is_prime[1] = false;
        for(int i=2;i*i<=max_len;i++){
            if(is_prime[i]){
                for(int j=i*i;j<=max_len;j+=i){
                    is_prime[j] = false;
                }
            }
        }
        for(int i=0;i<s.length();i++){
            int digit = s.charAt(i)-'0';
            if(!is_prime[digit]){
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
