package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j2020_1 {
    static int n, k;
    static int a[];
    static int saved[] = new int[10001]; 
    static Scanner sc = new Scanner(System.in);
    
    static void nhap() {
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void in() {
        // 2. Chạy đến k và in mảng saved[i]
        for (int i = 1; i <= k; i++) {
            System.out.printf("%d ", saved[i]);
        }
        System.out.println();
    }

    static void back_track_to_hop(int step, int start) {
        for (int i = start; i <= n - k + step; i++) {
            saved[step] = a[i];
            if (step == k) {
                in();
            } else {
                back_track_to_hop(step + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        nhap();
        back_track_to_hop(1, 1);
    }
}