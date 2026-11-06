package java_chuong_1.Java_c2;
import java.util.Scanner;
import java.util.Stack;

public class j3019 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        String s = sc.nextLine().trim();
        Stack<Character> st = new Stack<>();
       
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            while(!st.isEmpty() && (c-'0')>(st.peek()-'0')){
                st.pop();
            }
            st.push(c);
        }
        for(char x : st){
            System.out.print(x);
        }
        System.out.println();
    }
    public static void main(String[] args){
        solve();
    }
}
