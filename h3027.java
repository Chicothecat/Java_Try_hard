package java_chuong_1.Java_c2;
import java.util.Scanner;
import java.util.Stack;

public class h3027 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.empty() && s.charAt(i) == st.peek()){
                st.pop();
            }
            else st.push(s.charAt(i));
        }
        if(st.empty()) System.out.println("Empty String");
        else{
            for(Character x : st){
                System.out.print(x);
            }
       }
    }
    public static void main(String[] args){
        solve();
    }
}
