package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j2019 {
    static final int MAX = 1000000;
    static int[] sum = new int[MAX+1];
    static int a,b;
    static Scanner sc = new Scanner(System.in);
    // 
    static void sieve(){
        for(int i=1;i<=MAX/2;i++){
            for(int j=2*i;j<=MAX;j+=i){
                sum[j] += i;// i la uoc cua j
            }
        }
    }
   
    static int cnt_gia(){
        int cnt = 0;
        for(int i=a;i<=b;i++){
            if(sum[i]>i){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        sieve();
            a = sc.nextInt();
            b = sc.nextInt();
            int res = cnt_gia();
            System.out.println(res);
    }
 
}