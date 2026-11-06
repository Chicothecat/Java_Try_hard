
package java_chuong_1;
import java.util.Scanner;

public class j010 {
    static Scanner sc = new Scanner(System.in);
    public static boolean check(char c[]){
       for(int i=0;i<strlen(c);i++){
           if(c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'){
               return false;
           }
       }
        return true;
    }
     public static boolean check2(char c[]){
       for(int i=0;i<strlen(c);i++){
           int cnt=0;
           if(c=='0'){
               cnt++;
           }
       }
       if(cnt == strlen(c)) return false;
       return true;
    }
    public static void solve(char c[]){
        for(int i=0;i<strlen(c);i++){
            if(c=='0') c='0';
            else if(c='1') c='1';
            else if(c='8') c='0';
            else if(c='9') c='0';
            else if(c='0') c='0';
        }
    }
    public static void main(){
        string s = sc.nextString();
        if(check(s)){
            solve();
            if(check2()){
                System.out.println("INVALID");
            }else{
                for(int )
            }
            
        }else{
            System.out.println("INVALID");
        }
    }
}
