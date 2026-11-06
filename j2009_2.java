// Notion nootbook java class
package java_chuong_1.Java_c2;
import java.util.Scanner;
import java.util.Arrays;

// dinh nghiax class
class Khach implements Comparable<Khach>{
    int start,end;
    // constructor
    public Khach(int start, int end){
        this.start = start;
        this.end = end;
    }
    // khoi tao 1 ham uu tien 
    public int compareTo(Khach other){
        return Integer.compare(this.start,other.start);
    }
}

public class j2009_2 {
    static Scanner sc = new Scanner(System.in);
    static void solve(){
        int n = sc.nextInt();
        Khach[] a = new Khach[n];
        for(int i=0;i<n;i++){
            a[i] = new Khach(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a);
        // DP 
        int[] dp = new int[n];
        dp[0] = a[0].start + a[0].end;
        for(int i=1;i<n;i++){
            int start_time = Math.max(a[i].start,dp[i-1]);
            dp[i] = start_time + a[i].end;
        }
        System.out.println(dp[n-1]);
    }
    public static void main(String[] args){
        solve();
    }
}
