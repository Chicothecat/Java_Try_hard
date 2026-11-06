package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3004 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        String s = sc.nextLine(); // getline(cin,s)
        // Tach tu 
        String[] word = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder("");
        // Duyet qua tu trong mang
        for(int i=0;i<word.length;i++){
            String kitu = word[i];
            String firstChar = kitu.substring(0,1).toUpperCase();
            String restChar = kitu.substring(1).toLowerCase();
            res.append(firstChar).append(restChar).append(" ");
        }
        System.out.println(res.toString().trim());
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            solve();
        }
    }    
}
