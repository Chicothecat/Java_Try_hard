
package java_chuong_1.Java_c2;
import java.util.Scanner;

public class j2021 {
    static int n, k;
    static int saved[] = new int[10001];
    static int count = 0; 
    static Scanner sc = new Scanner(System.in);
    
    static void in() {
        for (int i = 1; i <= k; i++) {
            System.out.printf("%d", saved[i]);
        }
    }
    
    static void back_track_to_hop(int step, int start) {
        for (int i = start; i <= n - k + step; i++) {
            saved[step] = i; 
            if (step == k) {
                in();
                System.out.printf(" ");
                count++; 
            } else {
                back_track_to_hop(step + 1, i + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();
        
        back_track_to_hop(1, 1);
        System.out.println();
        System.out.println("Tong cong co " + count + " to hop");
    }
}
