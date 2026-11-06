package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j2023 {
   static Scanner sc = new Scanner(System.in);
   static void solve(){
       int n = sc.nextInt();
       int s = sc.nextInt();
       //
        if(s < 0 || (s == 0 && n > 1) || s > 9 * n){
            System.out.println("-1 -1");
            return;
        }
       //
       int[] max_num = new int[n];
       int s_max = s;
       
       for(int i=0;i<n;i++){
           int choice1 = Math.min(9,s_max);
           max_num[i] = choice1;
           s_max -= choice1;
       }
       //
       int[] min_num = new int[n];
       int s_min = s;
       for(int i=n-1;i>=0;i--){
           int choice2 = Math.min(9,s_min);
           min_num[i] = choice2;
           s_min -= choice2;
       }
        for(int i = 0; i < n; i++){
            System.out.print(min_num[i]);
        }
        System.out.print(" ");
        for(int i = 0; i < n; i++){
            System.out.print(max_num[i]);
        }
        System.out.println();
   }
   public static void main(String[] args){
       solve();
   }
}
