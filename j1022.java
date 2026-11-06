package java_chuong_1;
import java.util.Scanner;

public class j1022 {
    static Scanner sc = new Scanner(System.in);
    static long[] L = new long[93]; // gioi han 92: fibo
    
    public static void init() {
        L[1] = 1;
        L[2] = 1;
        for (int i = 3; i < 93; i++) {
            L[i] = L[i - 2] + L[i - 1];
        }
    }
    
    // k phai de kieu long
    public static char search(int n, long k) {
        // dieu kien stop & base-line
        if (n == 1) return '0';
        if (n == 2) return '1';
        
        // de quy 
        if (k <= L[n - 2]) {
            return search(n - 2, k);
        } else {
            return search(n - 1, k - L[n - 2]);
        }
    }

    // Bo tham so n, k o day
    public static void solve() {
        int n = sc.nextInt();
        long k = sc.nextLong(); // dung nextLong
        
        System.out.println(search(n, k));
    }

    public static void main(String[] args) {
        init(); // khoi tao san 
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}