package java_chuong_1.Java_c2;
import java.util.Scanner;
import java.util.Stack;

public class j2017 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a;
    static void nhap(){
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
    }
    static void solve(){
        n = sc.nextInt();
        a = new int[n+1];
        nhap();
        
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=n;i++){
            if(!st.empty() && (st.peek() + a[i])%2==0){
                st.pop();
            }
            else st.push(a[i]);
        }
        System.out.println(st.size());
    }
    public static void main(String[] args){
        solve();
    }
}
