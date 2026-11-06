package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j3032 {
    static Scanner sc = new Scanner(System.in);
    
    static void dao_ki_tu(String s){
        char[] arr = s.toCharArray();
        
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        String rev = new String(arr);
        System.out.print(rev + " ");
    }
    
    static void solve(){
        String s = sc.nextLine();
        String[] word = s.trim().split("\\s+");
        for(int i=0;i<word.length;i++){
            dao_ki_tu(word[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            solve();
        }
    }
}
