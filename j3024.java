package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3024 {
    static Scanner sc = new Scanner(System.in);
    static boolean check_chan1(String s){
        return s.length() %2 ==0;
    }
    static boolean check_chan2(String s){
        int cnt_chan = 0;
        int cnt_le = 0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2==0){
                cnt_chan++;
            }
            else cnt_le++;
        }
        if(cnt_chan > cnt_le) return true;
        else return false;
    }
    static boolean check_le2(String s){
        int cnt_chan = 0;
        int cnt_le = 0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2==0){
                cnt_chan++;
            }
            else cnt_le++;
        }
        if(cnt_chan < cnt_le) return true;
        else return false;
    }
    static boolean check_main(String s){
        if(s.length() == 0 || s.charAt(0) == '0') {
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
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
            if(check_main(s)){
                if(check_chan1(s) && check_chan2(s)|| !check_chan1(s) && check_le2(s)){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }else{
                System.out.println("INVALID");
            }
        }
    }
}
