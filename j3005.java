package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3005 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        String s =sc.nextLine();
        String[] word = s.trim().split("\\s+"); // ham trim cat bo " "
        // B1: Normalization
        for(int i=0;i<word.length;i++){
            
            if(i==0){
                word[i] = word[i].substring(0).toUpperCase();
            }
            else word[i] = word[i].substring(0,1).toUpperCase() + word[i].substring(1).toLowerCase();
        }
        // B2: in
        for(int i=1;i<word.length;i++){
            System.out.print(word[i]);
            if(i<word.length-1){
                System.out.print(" ");
            }
        }
        System.out.println(", " + word[0]);
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            solve();
        }
    }
        
}
